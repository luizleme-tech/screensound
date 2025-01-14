package com.luizlemetech.screensound.dados.dao

import javax.persistence.EntityManager

abstract class DAO<TModel, TEntity>(
    protected val manager: EntityManager,
    protected val entityType: Class<TEntity>
) {
    abstract fun toEntity(objeto: TModel): TEntity
    abstract fun toModel(entity: TEntity): TModel

    open fun getLista(): List<TModel> {
        val query = manager.createQuery("FROM ${entityType.simpleName}", entityType)
        return query.resultList.map { entity -> toModel(entity)}
    }

    open fun adicionar(objeto: TModel) {
        val entity = toEntity(objeto)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }

    open fun recuperarPeloId(id: Int): TModel {
        val entity = recuperarEntityPeloId(id)
        return toModel(entity)
    }

    open fun apagar(id: Int) {
        val entity = recuperarEntityPeloId(id)

        manager.transaction.begin()
        manager.remove(entity)
        manager.transaction.commit()
    }

    private fun recuperarEntityPeloId(id: Int): TEntity {
        val query = manager.createQuery("FROM ${entityType.simpleName} WHERE id =:id", entityType)
        query.setParameter("id", id)
        return query.singleResult
    }
}
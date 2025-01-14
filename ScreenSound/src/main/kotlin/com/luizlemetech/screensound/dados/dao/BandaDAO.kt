package com.luizlemetech.screensound.dados.dao

import com.luizlemetech.screensound.dados.entities.BandaEntity
import com.luizlemetech.screensound.extensions.toEntity
import com.luizlemetech.screensound.extensions.toModel
import com.luizlemetech.screensound.modelo.Banda
import javax.persistence.EntityManager

class BandaDAO(manager: EntityManager)
    : DAO<Banda, BandaEntity>(manager, BandaEntity::class.java) {

    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }

    override fun toEntity(objeto: Banda): BandaEntity {
       return objeto.toEntity()
    }
}
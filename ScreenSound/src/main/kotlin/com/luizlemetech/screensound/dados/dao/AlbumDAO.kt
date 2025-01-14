package com.luizlemetech.screensound.dados.dao

import com.luizlemetech.screensound.dados.entities.AlbumEntity
import com.luizlemetech.screensound.extensions.toEntity
import com.luizlemetech.screensound.extensions.toModel
import com.luizlemetech.screensound.modelo.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager)
    :DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {

    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }

    override fun toEntity(objeto: Album): AlbumEntity {
        return objeto.toEntity()
    }
}
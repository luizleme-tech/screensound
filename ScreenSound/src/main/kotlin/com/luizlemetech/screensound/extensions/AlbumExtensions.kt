package com.luizlemetech.screensound.extensions

import com.luizlemetech.screensound.dados.entities.AlbumEntity
import com.luizlemetech.screensound.modelo.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.titulo, this.banda.toEntity(), this.id)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.titulo, this.banda.toModel(), this.id)
}
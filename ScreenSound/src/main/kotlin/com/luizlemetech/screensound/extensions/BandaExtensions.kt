package com.luizlemetech.screensound.extensions

import com.luizlemetech.screensound.dados.entities.BandaEntity
import com.luizlemetech.screensound.modelo.Banda

fun Banda.toEntity(): BandaEntity {
    return BandaEntity(this.nome, this.descricao, this.id)
}

fun BandaEntity.toModel(): Banda {
    return Banda(this.nome, this.descricao, this.id)
}
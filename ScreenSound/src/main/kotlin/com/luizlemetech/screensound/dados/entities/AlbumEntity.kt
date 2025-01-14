package com.luizlemetech.screensound.dados.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "albuns")
class AlbumEntity (
    val titulo: String = "Titulo do Album",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)
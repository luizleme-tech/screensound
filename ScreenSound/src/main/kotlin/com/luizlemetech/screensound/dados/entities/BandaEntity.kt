package com.luizlemetech.screensound.dados.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "bandas")
class BandaEntity (
    val nome: String = "Nome da Banda",
    val descricao: String = "Descricao da Banda",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)
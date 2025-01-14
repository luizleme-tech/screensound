package com.luizlemetech.screensound.dados.config

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

object Banco {
    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("musicas")
        return factory.createEntityManager()
    }
}
package com.luizlemetech.screensound.principal

import com.luizlemetech.screensound.dados.config.Banco
import com.luizlemetech.screensound.dados.dao.AlbumDAO
import com.luizlemetech.screensound.dados.dao.BandaDAO
import com.luizlemetech.screensound.modelo.Album
import com.luizlemetech.screensound.modelo.Banda


fun main() {

    val manager = Banco.getEntityManager()

    val albumDAO = AlbumDAO(manager)
    val bandaDAO = BandaDAO(manager)


    val novaBanda = Banda("Titãs")
    bandaDAO.adicionar(novaBanda)

    val titas = bandaDAO.recuperarPeloId(1)

    val goBack = Album("GoBack", titas)
    val cabecaDinossauro = Album("Cabeca Dinosaurro", titas)

    albumDAO.adicionar(goBack)
    albumDAO.adicionar(cabecaDinossauro)

   val albuns = albumDAO.getLista()
    println(albuns)

    manager.close()
}
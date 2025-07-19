package com.example.mymensagecrist.data

import com.example.mymensagecrist.model.BibleMessage

class MessageRepository {
    private val messages = listOf(
        BibleMessage("Se Deus é por nós, quem será contra nós? (Rm 8:31)"),
        BibleMessage("O Senhor é o meu pastor, nada me faltará. (Sl 23:1)"),
        BibleMessage("Entrega o teu caminho ao Senhor; confia nele, e ele o fará. (Sl 37:5)")
    )

    fun getRandomMessage(): BibleMessage {
        return messages.random()
    }
}
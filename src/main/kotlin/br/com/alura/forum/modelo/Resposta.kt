package br.com.alura.forum.modelo

import br.com.alura.forum.modelo.Topico
import java.time.LocalDateTime
import br.com.alura.forum.modelo.Usuario
import br.com.alura.forum.modelo.Resposta

class Resposta {
    var id: Long? = null
    var mensagem: String? = null
    var topico: Topico? = null
    var dataCriacao = LocalDateTime.now()
    var autor: Usuario? = null
    var solucao = false

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (id == null) 0 else id.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as Resposta
        if (id == null) {
            if (other.id != null) return false
        } else if (id != other.id) return false
        return true
    }
}
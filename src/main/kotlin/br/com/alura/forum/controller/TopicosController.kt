package br.com.alura.forum.controller

import br.com.alura.forum.modelo.Curso
import br.com.alura.forum.modelo.Topico
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*
import kotlin.collections.ArrayList

@Controller
class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    fun lista(): ArrayList<Topico>{
        var topico1 = Topico(titulo = "duvida", mensagem = "Duvida com spring", curso = Curso(nome = "Sprint", categoria = "Programacao"))

        return arrayListOf(topico1, topico1, topico1, topico1)
    }
}
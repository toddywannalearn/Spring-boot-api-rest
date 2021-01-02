package br.com.alura.forum.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @RequestMapping("/")
    @ResponseBody
    fun hello(): String{
        return "Hello world";
    }

    @RequestMapping("/l")
    @ResponseBody
    fun countTo10(): IntArray {
        return intArrayOf(1,2,3,4,5)
    }

}
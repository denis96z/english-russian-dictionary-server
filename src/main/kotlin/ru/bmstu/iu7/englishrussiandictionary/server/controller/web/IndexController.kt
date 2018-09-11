package ru.bmstu.iu7.englishrussiandictionary.server.controller.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {
    @GetMapping("/")
    fun getIndex() : String {
        return "index"
    }
}

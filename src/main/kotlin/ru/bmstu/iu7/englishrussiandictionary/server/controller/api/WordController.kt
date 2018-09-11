package ru.bmstu.iu7.englishrussiandictionary.server.controller.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import ru.bmstu.iu7.englishrussiandictionary.server.exception.NotFoundException
import ru.bmstu.iu7.englishrussiandictionary.server.service.WordService

@RestController
@RequestMapping("/api/words")
class WordController(@Autowired
                     private val wordService: WordService) {
    @GetMapping("/english/{word}")
    fun translateWordFromEnglishIntoRussian(@PathVariable word: String) : String {
        return wordService.translateWordFromEnglishIntoRussian(word)
    }

    @GetMapping("/russian/{word}")
    fun translateWordFromRussianIntoEnglish(@PathVariable word: String) : String {
        return wordService.translateWordFromRussianIntoEnglish(word)
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException::class)
    fun handleNotFoundException(exception: NotFoundException) : String? {
        return exception.message
    }
}

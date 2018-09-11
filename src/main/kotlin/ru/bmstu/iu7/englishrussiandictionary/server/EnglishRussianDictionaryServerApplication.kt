package ru.bmstu.iu7.englishrussiandictionary.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EnglishRussianDictionaryServerApplication

fun main(args: Array<String>) {
    runApplication<EnglishRussianDictionaryServerApplication>(*args)
}

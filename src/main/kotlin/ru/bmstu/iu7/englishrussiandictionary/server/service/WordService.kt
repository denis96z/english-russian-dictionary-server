package ru.bmstu.iu7.englishrussiandictionary.server.service

interface WordService {
    fun translateWordFromEnglishIntoRussian(word: String) : String
    fun translateWordFromRussianIntoEnglish(word: String) : String
}

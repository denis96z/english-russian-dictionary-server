package ru.bmstu.iu7.englishrussiandictionaryserver.service

interface WordService {
    fun translateWordFromEnglishIntoRussian(word: String) : String
    fun translateWordFromRussianIntoEnglish(word: String) : String
}

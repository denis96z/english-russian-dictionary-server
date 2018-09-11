package ru.bmstu.iu7.englishrussiandictionaryserver.service

interface WordService {
    fun translateWordFromEnglishIntoRussian(word: String)
    fun translateWordFromRussianIntoEnglish(word: String)
}

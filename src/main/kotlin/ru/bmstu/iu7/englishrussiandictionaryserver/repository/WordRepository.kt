package ru.bmstu.iu7.englishrussiandictionaryserver.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.bmstu.iu7.englishrussiandictionaryserver.domain.Word

interface WordRepository : MongoRepository<Word, String> {
    fun findByInEnglish(inEnglish: String)
    fun findByInRussian(inRussian: String)
}

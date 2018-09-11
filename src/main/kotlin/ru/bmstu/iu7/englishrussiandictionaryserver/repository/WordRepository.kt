package ru.bmstu.iu7.englishrussiandictionaryserver.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.bmstu.iu7.englishrussiandictionaryserver.domain.Word
import java.util.*

interface WordRepository : MongoRepository<Word, String> {
    fun findByInEnglish(inEnglish: String) : Optional<Word>
    fun findByInRussian(inRussian: String) : Optional<Word>
}

package ru.bmstu.iu7.englishrussiandictionary.server.repository

import org.springframework.data.repository.CrudRepository
import ru.bmstu.iu7.englishrussiandictionary.server.domain.Word
import java.util.*

interface WordRepository : CrudRepository<Word, String> {
    fun findByInEnglish(inEnglish: String) : Optional<Word>
    fun findByInRussian(inRussian: String) : Optional<Word>
}

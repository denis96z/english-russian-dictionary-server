package ru.bmstu.iu7.englishrussiandictionaryserver.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.bmstu.iu7.englishrussiandictionaryserver.repository.WordRepository

@Service
class WordServiceImpl(@Autowired
                      private val wordRepository: WordRepository) : WordService {
    override fun translateWordFromEnglishIntoRussian(word: String) {
        TODO("not implemented")
    }

    override fun translateWordFromRussianIntoEnglish(word: String) {
        TODO("not implemented")
    }
}

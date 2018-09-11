package ru.bmstu.iu7.englishrussiandictionary.server.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.bmstu.iu7.englishrussiandictionary.server.exception.NotFoundException
import ru.bmstu.iu7.englishrussiandictionary.server.repository.WordRepository

@Service
class WordServiceImpl(@Autowired
                      private val wordRepository: WordRepository) : WordService {
    override fun translateWordFromEnglishIntoRussian(word: String): String {
        val existingWord = wordRepository.findByInEnglish(word)
        if (!existingWord.isPresent) {
            throw NotFoundException("Word not found")
        }
        return existingWord.get().inRussian
    }

    override fun translateWordFromRussianIntoEnglish(word: String): String {
        val existingWord = wordRepository.findByInRussian(word)
        if (!existingWord.isPresent) {
            throw NotFoundException("Word not found")
        }
        return existingWord.get().inEnglish
    }
}

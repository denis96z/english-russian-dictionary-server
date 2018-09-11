package ru.bmstu.iu7.englishrussiandictionary.server.controller.api

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import ru.bmstu.iu7.englishrussiandictionary.server.service.WordService

@RunWith(SpringRunner::class)
@WebMvcTest(value = [(WordController::class)], secure = false)
class WordControllerTests {
    @Autowired
    private val mockMvc: MockMvc? = null

    @MockBean
    private val mockWordService: WordService? = null

    @Test
    fun translateWordFromEnglishIntoRussian() {
        val wordInEnglish = "hello"
        val wordInRussian = "здравствуйте"

        Mockito
                .`when`(mockWordService!!.translateWordFromEnglishIntoRussian(wordInEnglish))
                .thenReturn(wordInRussian)

        mockMvc!!.perform(MockMvcRequestBuilders
                .get("/api/words/english/$wordInEnglish"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.content().string(wordInRussian))
    }
}

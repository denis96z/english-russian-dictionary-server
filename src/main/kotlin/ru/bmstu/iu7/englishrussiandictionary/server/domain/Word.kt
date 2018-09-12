package ru.bmstu.iu7.englishrussiandictionary.server.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Word(
        @Id
        var id: Long = 0,
        var inEnglish: String = "",
        var inRussian: String = ""
)

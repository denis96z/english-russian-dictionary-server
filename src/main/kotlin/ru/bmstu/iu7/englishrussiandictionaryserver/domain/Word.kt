package ru.bmstu.iu7.englishrussiandictionaryserver.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Word(
        @Id
        var id: String = "",
        var inEnglish: String = "",
        var inRussian: String = ""
)

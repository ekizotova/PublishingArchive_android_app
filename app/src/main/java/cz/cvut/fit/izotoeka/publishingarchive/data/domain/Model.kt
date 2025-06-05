package cz.cvut.fit.izotoeka.publishingarchive.data.domain

data class Book(
    val id: String,
    val title: String,
    val content: String,
    val authorName: String
)

data class Author(
    val id: String,
    val name: String,
    val location: String,
    val birthYear: Int
)

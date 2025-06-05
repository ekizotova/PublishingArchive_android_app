package cz.cvut.fit.izotoeka.publishingarchive.data

import cz.cvut.fit.izotoeka.publishingarchive.data.domain.Book

interface BookRepository {
    suspend fun getBooks(): List<Book>
    suspend fun addBook(book: Book)
}

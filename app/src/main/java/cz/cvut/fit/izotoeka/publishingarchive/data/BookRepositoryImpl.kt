package cz.cvut.fit.izotoeka.publishingarchive.data

import cz.cvut.fit.izotoeka.publishingarchive.data.BookRepository
import cz.cvut.fit.izotoeka.publishingarchive.data.domain.Book
import cz.cvut.fit.izotoeka.publishingarchive.data.domain.BookDao
import cz.cvut.fit.izotoeka.publishingarchive.data.domain.BookEntity

class BookRepositoryImpl(
    private val bookDao: BookDao
) : BookRepository {

    override suspend fun getBooks(): List<Book> = bookDao.getAll().map {
        Book(it.id, it.title, it.content, it.authorName)
    }

    override suspend fun addBook(book: Book) {
        bookDao.insert(BookEntity(book.id, book.title, book.content, book.authorName))
    }
}

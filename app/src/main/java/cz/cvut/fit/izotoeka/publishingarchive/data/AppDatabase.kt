package cz.cvut.fit.izotoeka.publishingarchive.data

import androidx.room.Database
import androidx.room.RoomDatabase
import cz.cvut.fit.izotoeka.publishingarchive.data.domain.BookDao
import cz.cvut.fit.izotoeka.publishingarchive.data.domain.BookEntity

@Database(entities = [BookEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}
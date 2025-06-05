package cz.cvut.fit.izotoeka.publishingarchive.domain

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class BookEntity(
    @PrimaryKey val id: String,

    val title: String,
    val content: String,
    val authorName: String
)

// todo: maybe change directory to data
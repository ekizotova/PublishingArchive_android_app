package cz.cvut.fit.izotoeka.publishingarchive.presentation.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import cz.cvut.fit.izotoeka.publishingarchive.R
import kotlinx.serialization.Serializable

sealed interface Screens {

    sealed interface TopLevel : Screens {
        @get:DrawableRes
        val icon: Int

        @get:StringRes
        val title: Int

        @Serializable
        data object Books : TopLevel {
            override val title: Int
                get() = R.string.books

            override val icon: Int
                get() = R.drawable.baseline_book_24
        }

        @Serializable
        data object Authors : TopLevel {
            override val title: Int
                get() = R.string.authors

            override val icon: Int
                get() = R.drawable.baseline_person_24
        }


        companion object {
            val all get() = listOf(Books, Authors)
        }
    }

    /*
    @Serializable
    data object Search : Screens

    @Serializable
    data class CharacterDetail(val id: Long) : Screens

     */
}
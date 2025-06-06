package cz.cvut.fit.izotoeka.publishingarchive

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cz.cvut.fit.izotoeka.publishingarchive.presentation.screens.Screens

@Composable
fun Navigation(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(modifier = modifier, navController = navController, startDestination = Screens.TopLevel.Books) {
        composable<Screens.TopLevel.Books> {
           // ListScreen(navController)
        }

        composable<Screens.TopLevel.Authors> {
            //  AuthorScreen(navController)
        }

        composable("book/{bookId}") { backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId")!!
            //BookDetailScreen(bookId)
        }
        composable("book") {
        //    BookScreen()
        }
        composable("account") {
          //  AccountScreen()
        }
        composable("publication") {
            //PublicationScreen()
        }

        //todo: don't forget search screen

            /*
        composable<Screens.CharacterDetail> { entry ->
            DetailScreen(navController)
        }

        composable<Screens.Search> {
            SearchScreen(navController)
        }
        */

    }
}
package com.shiva.keepnotes.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.shiva.keepnotes.navigation.screen.BottomNavItemScreen
import com.shiva.keepnotes.navigation.screen.Screen
import com.shiva.keepnotes.presentation.screen.checklistnote.CheckListNote
import com.shiva.keepnotes.presentation.screen.drawnote.DrawNote
import com.shiva.keepnotes.presentation.screen.editnote.EditNoteScreen
import com.shiva.keepnotes.presentation.screen.home.RootScreen
import com.shiva.keepnotes.presentation.screen.picturenote.PictureNote
import com.shiva.keepnotes.presentation.screen.search.SearchNotesScreen
import com.shiva.keepnotes.presentation.screen.voicenote.VoiceNote
import com.shiva.keepnotes.utils.Constants.NOTE_ARGUMENT_KEY

@Composable
fun MainNavGraph(navHostController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navHostController,
        route = Graph.MAIN,
        startDestination = BottomNavItemScreen.Home.route
    ) {
        composable(route = BottomNavItemScreen.Home.route) {
            RootScreen(navController = navHostController)
        }
        composable(route = BottomNavItemScreen.Search.route) {
            SearchNotesScreen(navController = navHostController)
        }
        composable(route = BottomNavItemScreen.CheckListNote.route) {
            CheckListNote()
        }
        composable(route = BottomNavItemScreen.DrawNote.route) {
            DrawNote()
        }
        composable(route = BottomNavItemScreen.VoiceNote.route) {
            VoiceNote()
        }
        composable(route = BottomNavItemScreen.PictureNote.route) {
            PictureNote()
        }

        detailsNavGraph(navHostController = navHostController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.EDITNOTE,
        startDestination = Screen.EditNote.route
    ) {
        composable(
            route = Screen.EditNote.route,
            arguments = listOf(navArgument(NOTE_ARGUMENT_KEY) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getString(NOTE_ARGUMENT_KEY, "-1")
            if (noteId != null) {
                EditNoteScreen(navController = navHostController,noteId = noteId)
            }
        }
    }
}
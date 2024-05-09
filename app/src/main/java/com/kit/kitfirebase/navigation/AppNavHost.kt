package com.kit.kitfirebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kit.kitfirebase.ui.theme.screens.home.HomeScreen
import com.kit.kitfirebase.ui.theme.screens.login.LoginScreen
import com.kit.kitfirebase.ui.theme.screens.projects.AddProductsScreen
import com.kit.kitfirebase.ui.theme.screens.projects.UpdateProductsScreen
import com.kit.kitfirebase.ui.theme.screens.projects.ViewProductsScreen
import com.kit.kitfirebase.ui.theme.screens.projects.ViewUploadsScreen
import com.kit.kitfirebase.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier =Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
       composable(ROUTE_ADD_PRODUCT) {         AddProductsScreen(navController)
       }
       composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
       }
       composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
           UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
       }
       composable(ROUTE_VIEW_UPLOAD){
           ViewUploadsScreen(navController)
        }
    }

}
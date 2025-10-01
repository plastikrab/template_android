package {{ cookiecutter.highDomain }}.{{ cookiecutter.domain }}.{{ cookiecutter.name }}.presentation.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import {{ cookiecutter.highDomain }}.{{ cookiecutter.domain }}.{{ cookiecutter.name }}.presentation.viewmodel.MainViewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController()
) {

}
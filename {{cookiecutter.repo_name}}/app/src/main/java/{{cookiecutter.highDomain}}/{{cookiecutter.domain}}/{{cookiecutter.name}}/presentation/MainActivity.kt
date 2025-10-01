package {{ cookiecutter.highDomain }}.{{ cookiecutter.domain }}.{{ cookiecutter.name }}.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.plastikrab.templateapp.presentation.ui.theme.TemplateAppTheme
import dev.plastikrab.templateapp.presentation.utils.PermissionsManager
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var permissionsManager: PermissionsManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        permissionsManager.context = this

        enableEdgeToEdge()
        setContent {
            TemplateAppTheme {

            }
        }
    }
}
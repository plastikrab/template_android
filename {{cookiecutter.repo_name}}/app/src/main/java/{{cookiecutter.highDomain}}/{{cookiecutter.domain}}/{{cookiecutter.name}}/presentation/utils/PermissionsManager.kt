package {{ cookiecutter.highDomain }}.{{ cookiecutter.domain }}.{{ cookiecutter.name }}.presentation.utils

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PermissionsManager @Inject constructor() {
    var context: Activity? = null

    companion object {
        private val PERMISSIONS = arrayOf(
            Manifest.permission.CAMERA,
        )
    }

    fun checkPermissions() {
        if (context != null){
            if (!hasRequiredPermissions()) {
                ActivityCompat.requestPermissions(
                    context,
                    PERMISSIONS,
                    0
                )
            }
        }
    }

    fun hasRequiredPermissions(): Boolean {
        return PERMISSIONS.all {
            ContextCompat.checkSelfPermission(
                context,
                it
            ) == PackageManager.PERMISSION_GRANTED
        }
    }
}
package {{ cookiecutter.highDomain }}.{{ cookiecutter.domain }}.{{ cookiecutter.name }}.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application()
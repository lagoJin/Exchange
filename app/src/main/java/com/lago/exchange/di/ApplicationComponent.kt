package com.lago.exchange.di

import android.app.Application
import com.lago.exchange.ExchangeApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ApplicationModule::class,
    AppAssistedInjectModule::class,
    MainActivityModule.MainActivityBuilder::class,
    ViewModelModule::class
])
interface ApplicationComponent : AndroidInjector<ExchangeApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): ApplicationComponent
    }
}

fun Application.createAppComponent() = DaggerApplicationComponent.factory().create(this)
package com.hitechcyclocomputer.domain

import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin() {
  startKoin {
    modules(appModule)
  }
}

val appModule = module {
  single { GetRidesUseCase(get()) }
}

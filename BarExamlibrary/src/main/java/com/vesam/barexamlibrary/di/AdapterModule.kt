package com.vesam.barexamlibrary.di

import com.vesam.barexamlibrary.ui.view.adapter.category_list.CategoryAdapter
import org.koin.dsl.module

val adapterModule = module {

    single { return@single CategoryAdapter(get()) }
}
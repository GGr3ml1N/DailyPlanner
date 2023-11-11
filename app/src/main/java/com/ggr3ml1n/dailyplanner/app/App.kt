package com.ggr3ml1n.dailyplanner.app

import android.app.Application
import com.ggr3ml1n.data.db.MainDataBase

class App: Application() {
    val dataBase by lazy { MainDataBase.getDataBase(this) }
}
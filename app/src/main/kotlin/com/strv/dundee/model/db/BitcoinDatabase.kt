package com.strv.dundee.model.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.strv.dundee.model.entity.Ticker

@Database(entities = arrayOf(Ticker::class), version = 1)
@TypeConverters(Converters::class)
abstract class BitcoinDatabase : RoomDatabase(){
    abstract fun userDao(): TickerDao
}
package com.cinema.guide.features.data.data_source.local // ktlint-disable package-name

import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@TypeConverters
abstract class AppDatabase : RoomDatabase()

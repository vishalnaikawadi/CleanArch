package com.bcg.life.data.di.module

import com.bcg.life.data.api.ApiHelper
import com.bcg.life.data.api.retrofit.RetrofitManager
import com.bcg.life.data.localdatabase.LocalDatabaseHelper
import com.bcg.life.data.localdatabase.room.RoomDatabaseManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun provideApiHelper(): ApiHelper {
        return RetrofitManager()
    }

    @Singleton
    @Provides
    fun provideLocalDatabaseHelper(): LocalDatabaseHelper {
        return RoomDatabaseManager()
    }

    /*@Singleton
    @Provides
    fun provideSharedPreferenceHelper() : SharedPreferenceHelper{
        return SharedPreferenceManager()
    }

    @Singleton
    @Provides
    fun provideLocalRoomDatabase(context: Context): LocalRoomDatabase {
        return Room.databaseBuilder(context, LocalRoomDatabase::class.java, DB_NAME)
            .addMigrations(MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6,
                MIGRATION_6_7,MIGRATION_7_8, MIGRATION_8_9, MIGRATION_9_10, MIGRATION_10_11)
         //   .fallbackToDestructiveMigration() //comment this line if data persistence required
            .build()
    }

    @Singleton
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    fun provideDiPulseSharedPreference(): DiPulseSharedPreference {
        return DiPulseSharedPreference()
    }*/

   /* @Singleton
    @Provides
    fun provideGoogleSignInOptions(): GoogleSignInOptionsExtension {
        return FitnessOptions.builder()
            .addDataType(DataType.TYPE_WEIGHT, FitnessOptions.ACCESS_READ)
            .addDataType(DataType.AGGREGATE_WEIGHT_SUMMARY, FitnessOptions.ACCESS_READ)
            .addDataType(DataType.TYPE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)
            .addDataType(DataType.AGGREGATE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)
            .addDataType(DataType.TYPE_HEART_RATE_BPM, FitnessOptions.ACCESS_WRITE)
            .addDataType(DataType.AGGREGATE_HEART_RATE_SUMMARY, FitnessOptions.ACCESS_WRITE)
            .build()
    }*/

    /*@Singleton
    @Provides
    fun provideGoogleFitHelper(): GoogleFitHelper {
        return GoogleFitManager()
    }*/


}


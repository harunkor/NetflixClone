package com.harunkor.netflixclone.di

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.data.remote.repository.*
import com.harunkor.netflixclone.domain.repository.*
import com.harunkor.netflixclone.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideRetrofit(gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit):ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideTopMoviesRepository(apiService: ApiService): TopMoviesRepository {
        return TopMoviesRepositoryImp(apiService)
    }

    @Provides
    @Singleton
    fun provideMostPopulerMoviesRepository(apiService: ApiService): MostPopulerMoviesRepository {
        return MostPopulerMoviesRepositoryImp(apiService)
    }

    @Provides
    @Singleton
    fun provideComingSoonRepository(apiService: ApiService): ComingSoonRepository {
        return ComingSoonRepositoryImp(apiService)
    }

    @Provides
    @Singleton
    fun provideSearchAllRepository(apiService: ApiService): SearchAllRepository {
        return SearchAllRepositoryImp(apiService)
    }

    @Provides
    @Singleton
    fun provideMostPopulerTvRepository(apiService: ApiService): MostPopulerTvRepository {
        return MostPopulerTvRepositoryImp(apiService)
    }

    @Provides
    @Singleton
    fun provideTopTvRepository(apiService: ApiService): TopTvRepository {
        return TopTvRepositoryImp(apiService)
    }



}
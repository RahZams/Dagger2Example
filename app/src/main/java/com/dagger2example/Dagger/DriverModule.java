package com.dagger2example.Dagger;

import com.dagger2example.Car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Singleton
    @Provides
    static Driver provideDriver(){
        return new Driver();
    }
}

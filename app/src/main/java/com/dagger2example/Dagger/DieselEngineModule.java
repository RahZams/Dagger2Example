package com.dagger2example.Dagger;

import com.dagger2example.Car.DieselEngine;
import com.dagger2example.Car.Engine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine engine){
        return engine;
    }
}

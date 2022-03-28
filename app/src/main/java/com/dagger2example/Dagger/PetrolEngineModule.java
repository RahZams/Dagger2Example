package com.dagger2example.Dagger;

import com.dagger2example.Car.Engine;
import com.dagger2example.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}

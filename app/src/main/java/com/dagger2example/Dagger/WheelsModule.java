package com.dagger2example.Dagger;

import com.dagger2example.Car.Rims;
import com.dagger2example.Car.Tires;
import com.dagger2example.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }


}

package com.dagger2example.Dagger;

import com.dagger2example.Car.Car;
import com.dagger2example.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {
    public Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }
}

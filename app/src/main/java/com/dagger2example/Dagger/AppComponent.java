package com.dagger2example.Dagger;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
//    Driver getDriver();

    // Used in case of diesel engine module
    // ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

    ActivityComponent.Builder getActivityComponentBuilder();
}

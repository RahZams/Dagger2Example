package com.dagger2example;

import android.app.Application;
import com.dagger2example.Dagger.AppComponent;
import com.dagger2example.Dagger.DaggerAppComponent;

public class ApplicationClass extends Application {

    //private ActivityComponent component;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
    //        component = DaggerCarComponent.builder()
    //                .horsePower(120)
    //                .engineCapacity(1400)
    //                .build();

        component = DaggerAppComponent.create();
    }

//    public ActivityComponent getComponent() {
//        return component;
//    }

    public AppComponent getComponent(){
        return component;
    }
}

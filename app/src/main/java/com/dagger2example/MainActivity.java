package com.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.dagger2example.Car.Car;
import com.dagger2example.Dagger.ActivityComponent;
import com.dagger2example.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
//    Car car1,car2;
    Car car;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // singleton doesnot work here as there are two instances of @Component
//        CarComponent carComponent1 = DaggerCarComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .build();
//
//        CarComponent carComponent2 = DaggerCarComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .build();

        // Used for constructor injection
        //Car car = carComponent.getCar();

        // Used for field injection
        //carComponent.inject(this);

        //car1.drive();
        //car2.drive();
        //carComponent1.getCar().drive();
        //carComponent2.getCar().drive();

//        ActivityComponent component = ((ApplicationClass)getApplication()).getComponent();
//        component.getCar().drive();
//        component.getCar().drive();

//        ActivityComponent component = DaggerActivityComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//        .appComponent(((ApplicationClass)getApplication()).getComponent())
//                .build();
//
//        component.getCar().drive();
//        component.getCar().drive();

        ActivityComponent activityComponent = ((ApplicationClass)getApplication()).getComponent()
                .getActivityComponentBuilder()
                .horsePower(140)
                .engineCapacity(1200)
                .build();
        activityComponent.getCar().drive();
        activityComponent.getCar().drive();

        Log.d(TAG, "onCreate: ");
        
        



    }
}
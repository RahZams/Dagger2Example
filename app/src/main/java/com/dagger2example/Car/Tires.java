package com.dagger2example.Car;

import android.util.Log;

public class Tires {
    //imagine this class belongs to third party library

    private static final String TAG = "Car";


    public Tires() {
    }

    public void inflate(){
        Log.d(TAG, "tires inflated");
    }
}

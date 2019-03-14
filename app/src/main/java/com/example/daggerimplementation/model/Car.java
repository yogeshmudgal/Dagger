package com.example.daggerimplementation.model;

import android.util.Log;

import javax.inject.Inject;


public class Car {

    private static final String TAG = "Car";
   private Engine mEngine;
   private Wheels mWheels;

   @Inject
    public Car(Engine mEngine, Wheels mWheels) {
       Log.d(TAG, "Car: Constuctor");
        this.mEngine = mEngine;
        this.mWheels = mWheels;
    }
    
    public void drive(){
        Log.d(TAG, "drive: ");
        mEngine.start();
    }



    @Inject
    public void enableRemote(Remote remote){
       remote.setListener(this);
    }
}

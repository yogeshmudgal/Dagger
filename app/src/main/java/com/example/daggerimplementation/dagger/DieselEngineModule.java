package com.example.daggerimplementation.dagger;


import android.util.Log;

import com.example.daggerimplementation.model.DieselEngine;
import com.example.daggerimplementation.model.Engine;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private static final String TAG = "DieselEngineModule";
    private int mHorsePower;

    @Inject
    public DieselEngineModule(int mHorsePower) {
        this.mHorsePower = mHorsePower;
    }

    @Provides
    Engine providesDieselEngine(){
        Log.d(TAG, "providesDieselEngine: "+mHorsePower);
       return new DieselEngine(mHorsePower);
    }

}

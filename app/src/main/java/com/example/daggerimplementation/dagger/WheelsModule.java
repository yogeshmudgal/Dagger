package com.example.daggerimplementation.dagger;

import android.util.Log;

import com.example.daggerimplementation.model.Rims;
import com.example.daggerimplementation.model.Tires;
import com.example.daggerimplementation.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    private static final String TAG = "WheelsModule";

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }


    @Provides
    Wheels provideWheels(Tires tires, Rims rims) {
        Log.d(TAG, "WheelsModule: ");
        return new Wheels(rims,tires);
    }
}

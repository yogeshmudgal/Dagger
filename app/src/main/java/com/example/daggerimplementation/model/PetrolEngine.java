package com.example.daggerimplementation.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    private int horsePower;
    private int engineCapactiy;

    @Inject
    public PetrolEngine(@Named("Horse Power") int horsePower,@Named("Engine Capacity") int engineCapactiy) {
        Log.d(TAG, "PetrolEngine: Constructor:\nHorsePower"+horsePower+"\nEngineCapacity"+engineCapactiy);
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol Engine");

    }
}

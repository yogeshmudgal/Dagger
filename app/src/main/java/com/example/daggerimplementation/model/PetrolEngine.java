package com.example.daggerimplementation.model;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
        Log.d(TAG, "PetrolEngine: Constructor");
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol Engine");

    }
}

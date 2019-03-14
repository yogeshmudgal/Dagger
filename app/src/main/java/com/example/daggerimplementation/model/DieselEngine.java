package com.example.daggerimplementation.model;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    private int mHorsePower;

    public DieselEngine(int horsePower) {
        Log.d(TAG, "DieselEngine: Constructor");
        this.mHorsePower=horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Diesel Engine");

    }
}

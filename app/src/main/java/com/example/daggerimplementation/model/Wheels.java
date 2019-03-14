package com.example.daggerimplementation.model;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "Wheels";
    @Inject
    public Wheels(Rims rims,Tires tires) {
        Log.d(TAG, "Wheels: ");
    }
}

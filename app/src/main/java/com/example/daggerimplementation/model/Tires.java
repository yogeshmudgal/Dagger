package com.example.daggerimplementation.model;

import android.util.Log;

import javax.inject.Inject;

public class Tires {

    private static final String TAG = "Tires";
    @Inject
    public Tires() {
    }

    public void inflate(){
        Log.d(TAG, "inflate: Tires");
    }
}

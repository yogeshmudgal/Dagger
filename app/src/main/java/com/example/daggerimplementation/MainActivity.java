package com.example.daggerimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.daggerimplementation.dagger.CarComponent;
import com.example.daggerimplementation.dagger.DaggerCarComponent;
import com.example.daggerimplementation.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent= DaggerCarComponent.builder()
                .bindHorsePower(700).bindEngineCapacity(1400)
                        .build();

       car= carComponent.getCar();

        car.drive();

    }



}

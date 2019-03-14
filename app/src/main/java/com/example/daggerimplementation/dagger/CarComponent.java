package com.example.daggerimplementation.dagger;


import com.example.daggerimplementation.MainActivity;
import com.example.daggerimplementation.model.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {

    public Car getCar();

    public void inject(MainActivity mainActivity);
}

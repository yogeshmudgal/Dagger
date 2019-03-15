package com.example.daggerimplementation.dagger;


import com.example.daggerimplementation.MainActivity;
import com.example.daggerimplementation.model.Car;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    public Car getCar();

    public void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
         Builder bindHorsePower(@Named("Horse Power") int horsePower);

        @BindsInstance
        Builder bindEngineCapacity(@Named("Engine Capacity") int engineCapacity);

        CarComponent build();
    }



}

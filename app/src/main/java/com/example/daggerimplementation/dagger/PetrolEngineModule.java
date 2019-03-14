package com.example.daggerimplementation.dagger;


import com.example.daggerimplementation.model.Engine;
import com.example.daggerimplementation.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindsPetrolEngine(PetrolEngine petrolEngine);

}

package com;

import com.example.dagger.River;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeModule {

    @Provides
    River provideRiver(){
        return new River();
    }
}

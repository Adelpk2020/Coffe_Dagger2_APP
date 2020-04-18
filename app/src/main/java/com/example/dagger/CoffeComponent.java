package com.example.dagger;

import com.CoffeModule;

import dagger.Component;

@Component(modules = CoffeModule.class)
public interface CoffeComponent {
    Coffe getCoffe();

    void inject(MainActivity mainActivity);
}

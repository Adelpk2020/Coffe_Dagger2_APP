package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Coffe {
    private static final String TAG = "Coffe";
    @Inject
     Farm farm;
    River river;

    @Inject
    public Coffe(River river) {
        this.river=river;
    }
    @Inject
    public  void  connectelectricity(){
        Log.d(TAG, "Adel connectelectricity: connecting.... ");
    }

    public String getcoffecup(){
        return farm.getbeans()+" + "+river.getwater() ;
    }
}

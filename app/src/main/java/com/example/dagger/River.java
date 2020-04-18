package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG ="River" ;

    //for view
    public River() {
        Log.d(TAG, "Adel River: ");
    }

    public String getwater(){

        return "Water";
    }
}

package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    @Inject
    Coffe coffe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Farm farm=new Farm();
//        River river=new River();
//        Coffe coffe=new Coffe(farm,river);
        CoffeComponent component=DaggerCoffeComponent.create();
        component.inject(this);
        Log.d(TAG, "Adel onCreate: "+coffe.getcoffecup());
    }
}

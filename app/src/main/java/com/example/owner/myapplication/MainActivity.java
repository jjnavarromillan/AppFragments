package com.example.owner.myapplication;


import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    ViewGroup container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        container = (ViewGroup) findViewById(R.id.container);
    }

    public void viewFragment1(View view) {
        FirstFragment firstFragment = new FirstFragment();
        getFragmentManager().beginTransaction().replace(R.id.container,firstFragment).commit();
    }

    public void viewFrament2(View view) {
        SecondFragment secondFragment = new SecondFragment();
        getFragmentManager().beginTransaction().replace(R.id.container,secondFragment).commit();
    }

    public void viewFragment3(View view) {
        ThirdFragment thirdFragment = new ThirdFragment();
        getFragmentManager().beginTransaction().replace(R.id.container,thirdFragment).commit();
    }
}

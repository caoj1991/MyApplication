package com.example.macabre.myapplication;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData(10);
    }


    @Override
    public void setData(int delay) {
        super.setData(delay);
        System.out.print(delay);
    }


    private void getData(){

    }
}

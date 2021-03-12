package com.sadadnan.customtoastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sadadnan.customtoastlib.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast.ShowSuccessToast(this,false,"Congratulations");
    }
}
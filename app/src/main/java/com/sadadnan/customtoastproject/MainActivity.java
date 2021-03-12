package com.sadadnan.customtoastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sadadnan.customtoastlib.CustomToast;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        initializeIDs();

        clickListeners();
    }

    private void clickListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.ShowSuccessToast(MainActivity.this,false,"Congratulations");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.ShowErrorToast(MainActivity.this,false,"We are extremely sorry.");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.ShowInfoToast(MainActivity.this,false,"We have updated your status.");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.showToastWithCustomDrawableAndBG(MainActivity.this,false,"Custom Icon",R.drawable.ic_baseline_auto_delete_24,R.color.toastColor);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.showToastWithoutIcon(MainActivity.this,false,"Without icon",R.color.toastColor2);
            }
        });
    }

    private void initializeIDs() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
    }
}
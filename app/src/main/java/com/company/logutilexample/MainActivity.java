package com.company.logutilexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.company.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("asdasdas");
    }
}

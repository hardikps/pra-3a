package com.example.prac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag="Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy invoked");
    }
}
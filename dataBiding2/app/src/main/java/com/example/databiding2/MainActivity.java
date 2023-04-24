package com.example.databiding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.databiding2.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding tasarim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.button.setOnClickListener(view -> {
            Snackbar.make(view, "Merhaba", Snackbar.LENGTH_SHORT).show();
        });
    }
}
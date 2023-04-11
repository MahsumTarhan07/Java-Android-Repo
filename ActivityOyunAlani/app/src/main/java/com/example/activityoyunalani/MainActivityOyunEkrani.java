package com.example.activityoyunalani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityOyunEkrani extends AppCompatActivity {
    private Button ButtonSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oyun_ekrani);

        ButtonSonuc = findViewById(R.id.buttonBitir);
        ButtonSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivityOyunEkrani.this,ActivitySonuc.class);
                finish(); //backstakten cıkmak için kullanılır
                startActivity(newIntent);
            }
        });


    }
}
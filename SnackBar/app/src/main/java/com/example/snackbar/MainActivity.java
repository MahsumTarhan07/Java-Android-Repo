package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonNormal,buttonGeriDonus,buttonOzel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNormal = findViewById(R.id.buttonNormal);
        buttonGeriDonus = findViewById(R.id.buttonGeriDonus);
        buttonOzel = findViewById(R.id.buttonOzel);


        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view ,"Merhaba",Snackbar.LENGTH_SHORT).show();
            }
        });

        buttonGeriDonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Mesaj Silinsin mi?",Snackbar.LENGTH_SHORT)
                        .setAction("Evet", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar.make(view, "Mesaj Silindi",Snackbar.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });

        buttonOzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,"Internet Bağlantısı Yok!",Snackbar.LENGTH_SHORT)
                        .setAction("Tekrar Dene", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        });

                snackbar.setActionTextColor(Color.RED);
                snackbar.setBackgroundTint(Color.WHITE);
                //snackbar.getView().setBackgroundColor(Color.WHITE);
                snackbar.setTextColor(Color.BLACK);

                snackbar.show();
            }
        });
    }
}
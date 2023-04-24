package com.example.spinnerkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button buttonGoster;
    private ArrayList<String> ulkeler = new ArrayList<>();
    private ArrayAdapter<String> veriAdaptoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        buttonGoster = findViewById(R.id.buttonGoster);


        ulkeler.add("Türkiye");
        ulkeler.add("Japonya");
        ulkeler.add("Irak");
        ulkeler.add("America");
        ulkeler.add("Fransa");
        ulkeler.add("Rusya");
        ulkeler.add("Çin");

        veriAdaptoru = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler);
        spinner.setAdapter(veriAdaptoru);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Secilen Ülkeler :" + ulkeler.get(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Secilen Ülkeler :" +
                                ulkeler.get(spinner.getSelectedItemPosition()),
                                Toast.LENGTH_SHORT).show();

            }
        });
    }
}
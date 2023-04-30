package com.example.timerpickervsdatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private EditText editTextSaat;
    private EditText editTextTarih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSaat = findViewById(R.id.editTextSaat);
        editTextTarih = findViewById(R.id.editTextTarih);

        editTextSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int saat = calendar.get(Calendar.HOUR_OF_DAY);
                int dakika = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog;

                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            editTextSaat.setText(i+" :" +i1);
                    }
                },saat,dakika,true);
                timePickerDialog.setTitle("Saat Seciniz");
                timePickerDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarlar",timePickerDialog);
                timePickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",timePickerDialog);

                timePickerDialog.show();
            }
        });

        editTextTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int yil = calendar.get(Calendar.YEAR);
                int ay = calendar.get(Calendar.MONTH);
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog;

                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        editTextSaat.setText(i2+" :" +i1 + "/" + i);
                    }
                },yil,ay,gun);

                datePickerDialog.setTitle("Tarih Seciniz");
                datePickerDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarlar",datePickerDialog);
                datePickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",datePickerDialog);

                datePickerDialog.show();
            }
        });
    }
}
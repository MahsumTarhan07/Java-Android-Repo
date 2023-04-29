package com.example.navigatorcompanet;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigatorcompanet.AnasayfaFragmentDirections;

public class AnasayfaFragment extends Fragment {
    private Button buttonBasla;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false);

        buttonBasla = tasarim.findViewById(R.id.buttonBasla);

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kisiler kisiler = new Kisiler(1,"Mahsum");

                AnasayfaFragmentDirections.OyunEkraniFragment gecis = AnasayfaFragmentDirections.oyunEkraninaGecis();
        
                Navigation.findNavController(v).navigate(gecis);
            }
        });

        return  tasarim;

    }
}
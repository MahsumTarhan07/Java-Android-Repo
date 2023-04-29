package com.example.navigatorcompanet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OyunEkraniFragment extends Fragment {
    private Button buttonBittir;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false);

        buttonBittir = tasarim.findViewById(R.id.oyunBittir);

        buttonBittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.sonucEkraniFragment);

            }
        });
        return tasarim;
    }
}
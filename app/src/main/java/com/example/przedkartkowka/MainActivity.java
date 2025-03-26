package com.example.przedkartkowka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.przedkartkowka.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMain Binding + 3 następne linijki binding + build Features w build gradle
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Random random = new Random();


        binding.button.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int liczba = random.nextInt(100);
                binding.textViewLiczba.setText(String.valueOf(liczba));
            }
        });

    }
}
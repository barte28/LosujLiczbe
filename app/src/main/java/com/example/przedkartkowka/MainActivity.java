package com.example.przedkartkowka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textViewLiczba;
    private Button button;
    private int liczba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textViewLiczba = findViewById(R.id.textViewLiczba);

        button.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                liczba = random.nextInt(100)+1;
                textViewLiczba.setText(String.valueOf(liczba));
            }
        });

    }
}
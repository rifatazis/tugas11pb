package com.example.tugas11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugas11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });
        binding.btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SearchAktivity.class);
            startActivity(intent);
        });
        binding.btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LibraryActivity.class);
            startActivity(intent);
        });
        binding.btn4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PremiumActivity.class);
            startActivity(intent);
        });
    }
}
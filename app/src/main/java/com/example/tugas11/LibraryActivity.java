package com.example.tugas11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugas11.databinding.ActivityLibraryBinding;
import com.example.tugas11.databinding.ActivityMainBinding;

public class LibraryActivity extends AppCompatActivity {

    private ActivityLibraryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLibraryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btn1.setOnClickListener(v -> {
            Intent intent = new Intent(LibraryActivity.this, MainActivity.class);
            startActivity(intent);
        });
        binding.btn2.setOnClickListener(v -> {
            Intent intent = new Intent(LibraryActivity.this, SearchAktivity.class);
            startActivity(intent);
        });
        binding.btn3.setOnClickListener(v -> {
            Intent intent = new Intent(LibraryActivity.this, LibraryActivity.class);
            startActivity(intent);
        });
        binding.btn4.setOnClickListener(v -> {
            Intent intent = new Intent(LibraryActivity.this, PremiumActivity.class);
            startActivity(intent);
        });
    }
}
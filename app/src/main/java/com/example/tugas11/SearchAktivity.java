package com.example.tugas11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugas11.databinding.ActivitySearchAktivityBinding;

public class SearchAktivity extends AppCompatActivity {

    private ActivitySearchAktivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySearchAktivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(v -> {
            Intent intent = new Intent(SearchAktivity.this, MainActivity.class);
            startActivity(intent);
        });
        binding.btn2.setOnClickListener(v -> {
            Intent intent = new Intent(SearchAktivity.this, SearchAktivity.class);
            startActivity(intent);
        });
        binding.btn3.setOnClickListener(v -> {
            Intent intent = new Intent(SearchAktivity.this, LibraryActivity.class);
            startActivity(intent);
        });
        binding.btn4.setOnClickListener(v -> {
            Intent intent = new Intent(SearchAktivity.this, PremiumActivity.class);
            startActivity(intent);
        });
    }
}
package com.example.articlesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;

import java.util.Objects;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_details);

        ImageButton back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(view -> {
                startActivity(new Intent(this, MainActivity.class));

            });

    }
}
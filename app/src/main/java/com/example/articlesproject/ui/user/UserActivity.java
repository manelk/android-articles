package com.example.articlesproject.ui.user;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.articlesproject.R;
import com.google.android.material.appbar.AppBarLayout;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        ImageView backbtn = findViewById(R.id.image_back_btn);
        TextView username  = findViewById(R.id.tv_username_profile);

        String name = getIntent().getStringExtra("name");
        username.setText(name);


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }


}
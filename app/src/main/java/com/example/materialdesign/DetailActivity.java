package com.example.materialdesign;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        TextView sportsDetail = findViewById(R.id.subTitleDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));
        sportsDetail.setText(getIntent().getStringExtra("details"));

        Glide.with(this).load(getIntent().getIntExtra("image_resource", 0))
                .into(sportsImage);
    }
}

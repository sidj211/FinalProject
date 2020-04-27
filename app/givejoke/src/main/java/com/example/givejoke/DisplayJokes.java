package com.example.givejoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        String joke = getIntent().getStringExtra("joke");
        TextView view = findViewById(R.id.tv_display_joke);
        view.setText(joke);
    }
}

package com.example.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescription);

        ArrayList<String> descriptions = new ArrayList<>();
        descriptions.add("Description for item 1");
        descriptions.add("Description for item 2");
        descriptions.add("Description for item 3");

    }
}

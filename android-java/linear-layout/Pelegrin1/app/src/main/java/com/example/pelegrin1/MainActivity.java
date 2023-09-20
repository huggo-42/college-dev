package com.example.pelegrin1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add1;
    Button add2;
    TextView res1;
    TextView res2;
    int Res1 = 0;
    int Res2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add1 = findViewById(R.id.add1);
        add2 = findViewById(R.id.add2);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);

        add1.setOnClickListener(v -> {
            Res1++;
            res1.setText(String.valueOf(Res1));
            displayResults();
        });
        add2.setOnClickListener(v -> {
            Res2++;
            res2.setText(String.valueOf(Res1));
            displayResults();
        });
    }
    private void displayResults() {
        res1.setText(String.valueOf(Res1));
        res2.setText(String.valueOf(Res2));
    }
}
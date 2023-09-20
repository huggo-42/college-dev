package br.com.test.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> showToast("Button 1 pressionado"));
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> showToast("Button 2 pressionado"));
    }

    void showToast(String text) {
        Toast.makeText(this, text, duration).show();
    }
}
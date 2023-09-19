package com.example.labexercise5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIOStatements();

            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenArithmeticOps();
            }
        });
    }

    public void OpenArithmeticOps() {
        Intent intent1 = new Intent(this, iostatements.class);
        startActivity(intent1);
    }

    public void openIOStatements() {
        Intent intent2 = new Intent(this, arithmetic.class);
        startActivity(intent2);
    }
}
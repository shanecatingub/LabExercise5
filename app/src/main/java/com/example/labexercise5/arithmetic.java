package com.example.labexercise5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class arithmetic extends AppCompatActivity {

    TextView text;
    EditText nameInput;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        text = findViewById(R.id.textView);
        nameInput = findViewById(R.id.editTextText);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> onBackPressed());
    }

    public void onClick(View view) {

        text.setText("hello, " + nameInput.getText() + " :)");

    }
}
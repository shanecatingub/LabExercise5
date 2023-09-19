package com.example.labexercise5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class iostatements extends AppCompatActivity {

    EditText num1, num2;
    TextView sum, diff, prod, quo;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iostatements);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        sum = findViewById(R.id.sumAns);
        diff = findViewById(R.id.differenceAns);
        prod = findViewById(R.id.productAns);
        quo = findViewById(R.id.quotientAns);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void OnClick(View v) {

        int num1int = Integer.parseInt(num1.getText().toString());
        int num2int = Integer.parseInt(num2.getText().toString());

        int sumInt = num1int + num2int;
        sum.setText(Integer.toString(sumInt));

        int diffInt = num1int - num2int;
        diff.setText(Integer.toString(diffInt));

        int prodInt = num1int * num2int;
        prod.setText(Integer.toString(prodInt));

        int quoInt = num1int / num2int;
        quo.setText(Integer.toString(quoInt));
    }
}
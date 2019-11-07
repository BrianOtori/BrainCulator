package com.example.brainculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView answer;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        answer = findViewById(R.id.answer);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
    }

    public void buttonClick(View view) {
        int number1;
        int number2;
        int sum;
        int subtract;
        int multiply;
        int divide;

        switch (view.getId()){
            case R.id.add:
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                sum = number1 + number2;
                answer.setText(String.valueOf(sum));
                break;

            case R.id.subtract:
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                subtract = number1 - number2;
                answer.setText(String.valueOf(subtract));
                break;

            case R.id.multiply:
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                multiply = number1 * number2;
                answer.setText(String.valueOf(multiply));
                break;

            case R.id.divide:
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                divide = number1 / number2;
                answer.setText(String.valueOf(divide));
        }

    }
}

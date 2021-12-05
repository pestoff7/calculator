package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sumBtn = (Button)findViewById(R.id.sumBtn);
        Button minusBtn = (Button)findViewById(R.id.minusBtn);
        Button multiBtn = (Button)findViewById(R.id.multiBtn);
        Button divideBtn = (Button)findViewById(R.id.divideBtn);
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);
        TextView result = (TextView)findViewById(R.id.result);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(firstNum.getText().toString());
                double b = Double.parseDouble(secondNum.getText().toString());
                double res = a + b;
                result.setText(res+"");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(firstNum.getText().toString());
                double b = Double.parseDouble(secondNum.getText().toString());
                double res = a - b;
                result.setText(res+"");
            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(firstNum.getText().toString());
                double b = Double.parseDouble(secondNum.getText().toString());
                double res = a * b;
                result.setText(res+"");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(firstNum.getText().toString());
                double b = Double.parseDouble(secondNum.getText().toString());
                double res = a / b;
                result.setText(res+"");
            }
        });
    }
}
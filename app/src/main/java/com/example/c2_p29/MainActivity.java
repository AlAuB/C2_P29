package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2, input3, input4;
    TextView view;
    int total, num1, num2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        view = findViewById(R.id.result);
        num1 = num2 = num3 = num4 = total = 0;

        input1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                System.out.println("Sequence" + charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String tempInput = input1.getText().toString();
                if (tempInput.length() == 0) {
                    tempInput = "0";
                }
                num1 = Integer.parseInt(tempInput) * 672;
                total = total + num1 + num2 + num3 + num4;
                view.setText(String.valueOf(total));
                total = 0;
            }
        });

        input2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String tempInput = input2.getText().toString();
                if (tempInput.length() == 0) {
                    tempInput = "0";
                }
                num2 = Integer.parseInt(tempInput) * 894;
                total = total + num1 + num2 + num3 + num4;
                view.setText(String.valueOf(total));
                total = 0;
            }
        });

        input3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String tempInput = input3.getText().toString();
                if (tempInput.length() == 0) {
                    tempInput = "0";
                }
                num3 = Integer.parseInt(tempInput) * 1471;
                total = total + num1 + num2 + num3 + num4;
                view.setText(String.valueOf(total));
                total = 0;
            }
        });

        input4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String tempInput = input4.getText().toString();
                if (tempInput.length() == 0) {
                    tempInput = "0";
                }
                num4 = Integer.parseInt(tempInput) * 59;
                total = total + num1 + num2 + num3 + num4;
                view.setText(String.valueOf(total));
                total = 0;
            }
        });
    }
}
package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button add;
    Button sub;
    Button divide;
    Button pro;
    EditText num1;
    EditText num2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.calc);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        divide = findViewById(R.id.div);
        pro = findViewById(R.id.pro);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ans = findViewById(R.id.ans);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numa=Float.parseFloat((num1.getText().toString()));
                float numb=Float.parseFloat(num2.getText().toString());
                float result = numa+numb;
                ans.setText(String.valueOf(result));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numa=Float.parseFloat((num1.getText().toString()));
                float numb=Float.parseFloat(num2.getText().toString());
                float result = numa-numb;
                ans.setText(String.valueOf(result));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float numa=Float.parseFloat((num1.getText().toString()));
                float numb=Float.parseFloat(num2.getText().toString());
                float result = numa/numb;
                ans.setText(String.valueOf(result));
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float numa=Float.parseFloat((num1.getText().toString()));
                float numb=Float.parseFloat(num2.getText().toString());
                float result = numa*numb;
                ans.setText(String.valueOf(result));
            }
        });

    }
}

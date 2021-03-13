package com.androiddev.calculatorpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.dreams.DreamService;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plus, minus, multiply, division;
    int tempX, tempY;
    TextView result;
    EditText x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = (EditText) findViewById(R.id.x);
        y = (EditText) findViewById(R.id.y);
        result = (TextView) findViewById(R.id.result);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.divide);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        division.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        tempX = Integer.parseInt(x.getText().toString());
        tempY = Integer.parseInt(y.getText().toString());
        int sum = 0;
        switch (v.getId()) {
            case R.id.plus:
                sum = tempX + tempY;
                result.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "DONE ! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.minus:
                sum = tempX - tempY;
                result.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "DONE ! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.multiply:
                sum = tempX * tempY;
                result.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, "DONE ! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.divide:
                boolean answer = true;
                try {
                    sum = tempX / tempY;
                }catch (Exception e ){
                    Toast.makeText(MainActivity.this, "OOPS , Something is wrong ! ", Toast.LENGTH_SHORT).show();
                answer=false;
                }
                result.setText(String.valueOf(sum));
                if (answer==true){
                    Toast.makeText(MainActivity.this, "DONE ! ", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
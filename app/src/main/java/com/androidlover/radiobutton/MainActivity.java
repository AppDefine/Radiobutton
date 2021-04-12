package com.androidlover.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.rg);

        rb1=(RadioButton)findViewById(R.id.one);
        rb2=(RadioButton)findViewById(R.id.two);
        rb3=(RadioButton)findViewById(R.id.three);
        rb4=(RadioButton)findViewById(R.id.four);
        rb5=(RadioButton)findViewById(R.id.five);
        rb6=(RadioButton)findViewById(R.id.six);
        rb7=(RadioButton)findViewById(R.id.seven);
        rb8=(RadioButton)findViewById(R.id.eight);
        rb9=(RadioButton)findViewById(R.id.nine);
        rb10=(RadioButton)findViewById(R.id.ten);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"One",Toast.LENGTH_SHORT).show();
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Two",Toast.LENGTH_SHORT).show();
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Three",Toast.LENGTH_SHORT).show();
            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Four",Toast.LENGTH_SHORT).show();
            }
        });

        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Five",Toast.LENGTH_SHORT).show();
            }
        });

        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Six",Toast.LENGTH_SHORT).show();
            }
        });

        rb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Seven",Toast.LENGTH_SHORT).show();
            }
        });

        rb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Eight",Toast.LENGTH_SHORT).show();
            }
        });

        rb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Nine",Toast.LENGTH_SHORT).show();
            }
        });

        rb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ten",Toast.LENGTH_SHORT).show();
            }
        });
















    }

}
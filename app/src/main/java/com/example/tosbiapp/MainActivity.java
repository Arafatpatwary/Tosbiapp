package com.example.tosbiapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

ImageView imageView;
        private Button b1;
        private Button b2;
        private Button b3;
        private Button b4;
        private TextView result;
        public int count0,count1,count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.click);
        imageView.setOnClickListener(this);


        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);


        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);



        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);



        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        result=(TextView) findViewById(R.id.count);





    }



    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.click){
            Toast.makeText(MainActivity.this, "Arafat is click successful", Toast.LENGTH_SHORT).show();
        }


        if (v.getId() == R.id.button1) {

            if (count0 <= 33) {

                result.setText("আল্লাহ-হু‌" +
                        "=" + count0++);

            }}


        if (v.getId() == R.id.button2) {

            if (count1 <= 33) {
                result.setText("সুবহানা্ল্লাহ" +
                        "=" + count1++);
            }}


        if (v.getId() == R.id.button3) {


            if (count2 <= 34) {

                result.setText("আলহামদুলিল্লাহ্‌" +
                        "=" + count2++);
            }
        }
        if (v.getId()==R.id.button4){

            count0=0;
            count1=0;
            count2=0;
            result.setText("Clear Succeccful");

        }
    }

    }


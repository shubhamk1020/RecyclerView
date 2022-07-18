package com.mastercoding.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mastercoding.recyclerview.cardview.CardActivity;
import com.mastercoding.recyclerview.multipleView.MultipleActivity;
import com.mastercoding.recyclerview.normal.NormalRecycerView;
import com.mastercoding.recyclerview.singleview.SingleActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1 , btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button);
        btn3 = findViewById(R.id.single_btn);
        btn4 = findViewById(R.id.multiple_btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NormalRecycerView.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CardActivity.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SingleActivity.class);
                startActivity(i);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MultipleActivity.class);
                startActivity(i);
            }
        });
    }
}
package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);


            Button imageButton = (Button) findViewById(R.id.btn_1); // 메뉴 4개중 1개의 버튼이름
            imageButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), SubActivity01.class); //수정
                    startActivity(intent);
                }
            });

        imageButton = (Button) findViewById(R.id.btn_2);
            imageButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), SubActivity02.class); //수정
                    startActivity(intent);
            }
        });
        imageButton = (Button) findViewById(R.id.btn_3);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity03.class); //수정
                startActivity(intent);
            }
        });
        imageButton = (Button) findViewById(R.id.btn_4);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity04.class); //수정
                startActivity(intent);
            }
        });
        }

    }

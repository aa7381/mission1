package com.example.mission1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity    {



    Button bluebtn, redbtn, pausebtn;
    int sumblue, sumred;
    int ok ;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluebtn = findViewById(R.id.bluebtn);
        redbtn = findViewById(R.id.redbtn);
        pausebtn = findViewById(R.id.pausebtn);
        sumblue = 0;
        sumred = 0;





        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumblue += 1;
            }
        });

        redbtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                sumred += 2;
                return true;
            }
        });

        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmenu();
            }
        });
    }

    public void openmenu() {

        Intent si = new Intent(this,menuactivity.class);
        si.putExtra("blue", sumblue);
        si.putExtra("red", sumred);
        startActivity(si);
    }
    }
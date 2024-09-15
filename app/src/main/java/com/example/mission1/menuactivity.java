package com.example.mission1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuactivity extends AppCompatActivity {

    Button backbtn;
    TextView bluetV, redtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        backbtn = findViewById(R.id.backbtn);
        bluetV = findViewById(R.id.bluetV);
        redtV = findViewById(R.id.redtV);
        Intent gi = getIntent();
        int sumblue2 = gi.getIntExtra("blue",1);
        int sumred2 = gi.getIntExtra("red",1);


        bluetV.setText(String.valueOf(sumblue2));
        redtV.setText(String.valueOf(sumred2));
        if(sumblue2> sumred2)
            Toast.makeText(this, "blue win ", Toast.LENGTH_SHORT).show();
        else if(sumblue2 < sumred2)
            Toast.makeText(this, "red win  ", Toast.LENGTH_SHORT).show();
        else if(sumblue2 == sumred2)
            Toast.makeText(this, "draw ", Toast.LENGTH_SHORT).show();
    }
    public void backclicked(View view)
    {


        finish();

    }

    }

package com.example.i170889.tower_defense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AcceuilActivity extends AppCompatActivity {
    Button buttonPlay;
    Button buttonInformation;
    Button buttonRegle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        buttonPlay = findViewById(R.id.play);
        buttonInformation = findViewById(R.id.buttonInformation);
        buttonRegle = findViewById(R.id.buttonRegle);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirMainActivity();
            }
        });
        buttonInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirInformationActivity();
            }
        });
        buttonRegle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirRegleActivity();
            }
        });


    }

    public void ouvrirMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ouvrirInformationActivity() {
        Intent intent = new Intent(this, informationActivity.class);
        startActivity(intent);
    }

    public void ouvrirRegleActivity() {
        Intent intent = new Intent(this, regleActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }
}

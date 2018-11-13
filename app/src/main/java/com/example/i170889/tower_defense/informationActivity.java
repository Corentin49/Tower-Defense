package com.example.i170889.tower_defense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class informationActivity extends AppCompatActivity {
    Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        buttonRetour = findViewById(R.id.buttonRetour);

        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirAcceuilActivity();
            }
        });
    }

    public void ouvrirAcceuilActivity() {
        Intent intent = new Intent(this, AcceuilActivity.class);
        startActivity(intent);
    }
}

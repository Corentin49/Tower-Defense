package com.example.i170889.tower_defense;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoseActivity extends AppCompatActivity {
    TextView bestScore;
    Button buttonRejouer;
    Button buttonMenu;
    TextView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
        bestScore = findViewById(R.id.bestScore);
        buttonRejouer = findViewById(R.id.buttonJouer);
        buttonMenu = findViewById(R.id.buttonMenu);
        scoreView = findViewById(R.id.score);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String scoreM = preferences.getString("Score", "");

            bestScore.setText("Meilleur Score : " + Integer.parseInt(scoreM));
            scoreView.setText("Score : " + getIntent().getIntExtra("score",0));

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirMainActivity();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirAccueilActivity();
            }
        });

    }

    public void ouvrirMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ouvrirAccueilActivity() {
        Intent intent = new Intent(this, AcceuilActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
    }
}

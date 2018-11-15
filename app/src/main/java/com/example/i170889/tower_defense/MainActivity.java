package com.example.i170889.tower_defense;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int score;
    public RelativeLayout fenetrePrincipale;
    public Display display;
    public Point size;
    protected List<Mob> listMobs;
    protected List<Tower> listTour;
    Timer timer;
    int gold;
    int temps;
    TextView goldText;
    int timeMob;
    TextView scoreText;
    int compteur;
    boolean lose;
    double lifeMob;
    MediaPlayer mySound;
    private List<Mob> listMobsRemove;
    private int timeWave;
    private int compteurWave;
    private int nbMob;
    MusicManager musicManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        fenetrePrincipale = findViewById(R.id.fenetrePrincipale);
        scoreText = findViewById(R.id.score);
        goldText = findViewById(R.id.gold);
        mySound = MediaPlayer.create(this, R.raw.music);
        mySound.start();

        initVariable();
        gererMap();
        initTower();
        lancerJeu();
    }

    @Override
    protected void onStop() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();


        String bestScore = preferences.getString("Score", "");
        if (bestScore.equalsIgnoreCase("") || Integer.parseInt(bestScore) <= score) {
            editor.putString("Score", Integer.toString(this.score));
        }
        editor.apply();
        mySound.stop();
        super.onStop();
    }

    @Override
    protected void onPause() {
        mySound.pause();
        super.onPause();
    }

    @Override
    protected  void onResume() {
        mySound.start();
        super.onResume();
    }

    public void gererMob(double life) {
        Mob mob = new Mob(this, "Monkey", life, size.x / 2, 0.0f);
        listMobs.add(mob);
    }

    public void initVariable() {
        listMobsRemove = new ArrayList<>();
        listMobs = new ArrayList<>();
        listTour = new ArrayList<>();
        timer = new Timer();
        timeMob = 600;
        lifeMob = 1000;
        temps = 0;
        score = 0;
        gold = 50;
        compteur = 0;
        timeWave = 0;
        compteurWave = 0;
        nbMob = 5;
        musicManager = new MusicManager(this);


    }

    public void initTower() {
        Tower middleTower = new Tower(this, size.x / 2 + 100, 500.0f);
        Tower bottomMiddleTower = new Tower(this, size.x / 2 - 60, 990.0f);
        Tower topTower = new Tower(this, size.x / 2 - 160, 50.0f);
        Tower topLeftTower = new Tower(this, 0, 200.0f);
        Tower bottomLeftTower = new Tower(this, 0, 700.0f);

        listTour.add(middleTower);
        listTour.add(bottomLeftTower);
        listTour.add(topLeftTower);
        listTour.add(bottomMiddleTower);
        listTour.add(topTower);

    }

    public void ouvrirLoseActivity() {
        Intent intent = new Intent(this, LoseActivity.class);
        intent.putExtra("score", getScore());
        startActivity(intent);
    }


    public void gererMap() {
        Map map = new Map(this);
        map.creatMap();
    }

    private void lancerJeu() {

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isLose()) {
                            temps++;


                            if (temps >= timeMob) {
                                timeWave++;
                                if (timeWave == 200) {
                                    gererMob(lifeMob);
                                    if (compteurWave >= nbMob) {
                                        nbMob++;
                                        temps = 0;
                                        compteurWave = 0;
                                    }
                                    compteur++;
                                    compteurWave++;
                                    timeWave = 0;
                                }


                            }


                            if (compteur == 10) {
                                compteur = 0;
                                timeMob -= 50;
                                lifeMob += 800;
                            }


                            for (Mob unMob : listMobs) {
                                unMob.move();
                                if (unMob.getLife() <= 0) {
                                    listMobsRemove.add(unMob);
                                    musicManager.jouerSonMort();
                                    setGold(getGold() + 10);
                                    setScore(getScore() + 100);

                                }

                            }
                            listMobs.removeAll(listMobsRemove);


                            scoreText.setText("Score : " + score);
                            goldText.setText("Gold : " + gold);
                            if (!mySound.isPlaying()) {
                                mySound.start();
                            }


                        } else {
                            timer.cancel();
                            ouvrirLoseActivity();

                        }

                    }
                });

            }
        };
        timer.schedule(timerTask, 1000, 10);

    }


    @Override
    public void onBackPressed() {
    }


    public int getGold() {
        return this.gold;
    }

    public void setGold(int score) {
        this.gold = score;
    }

    public List<Tower> getListTour() {
        return listTour;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isLose() {
        return lose;
    }

    public void setLose(boolean lose) {
        this.lose = lose;
    }


}
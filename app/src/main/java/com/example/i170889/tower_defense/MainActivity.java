package com.example.i170889.tower_defense;

import android.content.SharedPreferences;
import android.graphics.Point;
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
    public RelativeLayout fenetrePrincipale;
    public Display display;
    public Point size;
    Timer timer = new Timer();
    TimerTask task;
    protected List<Mob> listMobs = new ArrayList<>();
    protected List<Tower> listTour = new ArrayList<>();
    private List<Mob> listMobsRemove = new ArrayList<>();
    int temps = 0;
    int score = 50;
    int timeMob;
    TextView scoreText;
    int compteur = 0;
    double lifeMob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        fenetrePrincipale = findViewById(R.id.fenetrePrincipale);
        timeMob = 600;
        lifeMob = 1000;
        scoreText= findViewById(R.id.score);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String scoreM = preferences.getString("Score", "");
        if (!scoreM.equalsIgnoreCase("")){
            score = Integer.parseInt(scoreM);
        } else {
            score = 0;
        }

        gererMap();
        initTower();


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        temps++;


                        if (temps == timeMob) {
                            gererMob(lifeMob);
                            compteur++;
                            temps = 0;

                        }

                        if (compteur == 10) {
                            compteur = 0;
                            timeMob -= 50;
                            lifeMob += 50;
                        }

                        for (Mob unMob : listMobs) {
                            unMob.move();
                            if (unMob.getLife() <= 0) {
                                listMobsRemove.add(unMob);
                                setScore(getScore() + 10);
                            }

                        }

                        listMobs.removeAll(listMobsRemove);

                        scoreText.setText("Score : "+score);

                    }
                });

            }
        };
        timer.schedule(timerTask, 1000, 10);
    }

    @Override
    protected void onStop(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("Score", Integer.toString(this.score));

        editor.apply();
        super.onStop();
    }

    public void gererMob(double life) {
        Mob mob = new Mob(this, "Monkey", life, size.x / 2, 0.0f);
        listMobs.add(mob);
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


    public void gererMap() {
        Map map = new Map(this);
        map.creatMap();
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public List<Mob> getListMobs() {
        return listMobs;
    }

    public List<Tower> getListTour() {
        return listTour;
    }

}
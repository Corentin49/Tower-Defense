package com.example.i170889.tower_defense;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

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
    int temps = 0;
    int timeMob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        fenetrePrincipale = findViewById(R.id.fenetrePrincipale);
        timeMob = 400;

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        temps++;

                        if (temps == timeMob) {
                            gererMob();
                            temps = 0;

                        }
                        for (Mob unMob : listMobs) {
                            unMob.move();
                        }
                    }
                });

            }
        };
        timer.schedule(timerTask, 1000, 10);
    }

    public void gererMob() {
        Mob mob = new Mob(this, "Monkey",100.0, size.x / 2, 0.0f);
        listMobs.add(mob);
    }

}
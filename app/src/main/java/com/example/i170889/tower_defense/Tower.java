package com.example.i170889.tower_defense;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Tower {
    private MainActivity context;
    private ImageButton towerImage;
    private ViewGroup.LayoutParams params;
    private float X;
    private float Y;
    private int lvlTower;

    public Tower(MainActivity pcontext, float X, float Y) {
        this.context = pcontext;
        this.X = X;
        this.Y = Y;
        showTower();
        this.lvlTower = 0;
    }

    public void showTower() {


        towerImage = new ImageButton(context);
        towerImage.setBackgroundResource(R.drawable.towerlvl0);

        params = new ViewGroup.LayoutParams(150, 150);
        towerImage.setLayoutParams(params);

        towerImage.setX(this.X);
        towerImage.setY(this.Y);

        context.fenetrePrincipale.addView(towerImage);

        towerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean appliquer = false;

                if (getLvlTower() == 0 && appliquer == false) {
                    if (context.getScore() >= 50) {
                        towerImage.setBackgroundResource(R.drawable.towerlvl1);
                        context.setScore(context.getScore() - 50);
                        setLvlTower(getLvlTower() + 1);
                        appliquer = true;
                    }
                }

                if (getLvlTower() == 1 && appliquer == false) {
                    if (context.getScore() >= 100) {
                        towerImage.setBackgroundResource(R.drawable.towerlvl2);
                        context.setScore(context.getScore() - 100);
                        setLvlTower(getLvlTower() + 1);
                        appliquer = true;
                    }
                }


                if (getLvlTower() == 2 && appliquer == false) {
                    if (context.getScore() >= 150) {
                        towerImage.setBackgroundResource(R.drawable.towerlvl3);
                        context.setScore(context.getScore() - 150);
                        setLvlTower(getLvlTower() + 1);
                        appliquer = true;
                    }
                }


                if (getLvlTower() == 3 && appliquer == false) {
                    if (context.getScore() >= 200) {
                        towerImage.setBackgroundResource(R.drawable.towerlvl4);
                        context.setScore(context.getScore() - 200);
                        setLvlTower(getLvlTower() + 1);
                        appliquer = true;
                    }
                }

                if (getLvlTower() == 4 && appliquer == false) {
                    if (context.getScore() >= 300) {
                        towerImage.setBackgroundResource(R.drawable.towerlvl5);
                        context.setScore(context.getScore() - 300);
                        setLvlTower(getLvlTower() + 1);
                        appliquer = true;
                    }
                }

            }
        });
    }

    public int getLvlTower() {
        return lvlTower;
    }

    public void setLvlTower(int lvlTower) {
        this.lvlTower = lvlTower;
    }


    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }


}

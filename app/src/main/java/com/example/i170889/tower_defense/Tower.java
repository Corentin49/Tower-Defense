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
    private Mob mobTarget;
    private double damage;
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

                switch (getLvlTower()){
                    case 0:
                        if(context.getGold() >= 50) {
                            towerImage.setBackgroundResource(R.drawable.towerlvl1);
                            context.setGold(context.getGold() - 50);
                            setLvlTower(getLvlTower() + 1);
                            setDamage(5.4);
                        }
                        break;
                    case 1:
                        if(context.getGold() >= 100) {
                            towerImage.setBackgroundResource(R.drawable.towerlvl2);
                            context.setGold(context.getGold() - 100);
                            setLvlTower(getLvlTower() + 1);
                            setDamage(8.4);
                        }
                        break;
                    case 2 :
                        if(context.getGold() >= 150) {
                            towerImage.setBackgroundResource(R.drawable.towerlvl3);
                            context.setGold(context.getGold() - 150);
                            setLvlTower(getLvlTower() + 1);
                            setDamage(10.4);
                        }
                        break;
                    case 3:
                        if(context.getGold() >= 200) {
                            towerImage.setBackgroundResource(R.drawable.towerlvl4);
                            context.setGold(context.getGold() - 200);
                            setLvlTower(getLvlTower() + 1);
                            setDamage(12.4);
                        }
                        break;
                     case 4:
                         if(context.getGold() >= 300) {
                             towerImage.setBackgroundResource(R.drawable.towerlvl5);
                             context.setGold(context.getGold() - 300);
                             setLvlTower(getLvlTower() + 1);
                             setDamage(17.4);
                         }
                         break;
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

    public Mob getMobTarget() {
        return mobTarget;
    }

    public void setMobTarget(Mob mobTarget) {
        this.mobTarget = mobTarget;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}

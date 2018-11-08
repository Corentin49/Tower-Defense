package com.example.i170889.tower_defense;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Mob {
    private String name;
    private int speed;
    private double life;
    private MainActivity context;
    private ImageView mobB;
    private float X;
    private float Y;
    private ViewGroup.LayoutParams params;
    private String chemin[] = {"bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas"};
    private int position;


    public Mob(MainActivity pContext, String name, double life, float X, float Y) {
        this.name = name;
        this.life = life;
        context = pContext;
        this.position = 0;
        this.X = X;
        this.Y = Y;
        getMobB();
    }

    public void getMobB() {

        mobB = new ImageButton(context);
        mobB.setBackgroundResource(R.drawable.mobmonkeybottom);

        params = new ViewGroup.LayoutParams(150, 150);
        mobB.setLayoutParams(params);

        mobB.setX(X);
        mobB.setY(Y);

        context.fenetrePrincipale.addView(mobB);

    }

    public void move() {

        if (chemin.length - 1 > position) {
            int i = 0;
            if (chemin[position] == "bas") {
                mobB.setBackgroundResource(R.drawable.mobmonkeybottom);
                mobB.setY(mobB.getY() + 1);
            } else if (chemin[position] == "gauche") {
                //mob1.setBackgroundResource(R.drawable.mobmonkeyleft);
                mobB.setX(mobB.getX() - 1);
            } else if (chemin[position] == "droite") {
                //mob1.setBackgroundResource(R.drawable.mobmonkeyright);
                mobB.setX(mobB.getX() + 1);
            }
            position++;
        } else {
            Log.i("GAME-OVER", "FINI");

        }
    }



    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }


    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }


    public String[] getChemin() {
        return chemin;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getLife() {
        return life;
    }

}

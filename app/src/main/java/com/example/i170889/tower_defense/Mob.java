package com.example.i170889.tower_defense;

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
    public static final String chemin[] = {"bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas"};
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

        params = new ViewGroup.LayoutParams(110, 110);
        mobB.setLayoutParams(params);

        mobB.setX(X);
        mobB.setY(Y);

        context.fenetrePrincipale.addView(mobB);

    }

    public void move() {

        if (chemin.length - 1 > position) {
            if (chemin[position] == "bas") {
                mobB.setY(mobB.getY() + 1);
            } else if (chemin[position] == "gauche") {
                mobB.setX(mobB.getX() - 1);
            } else if (chemin[position] == "droite") {
                mobB.setX(mobB.getX() + 1);
            }
            position++;
        } else {

        }
        this.getDistance();
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

    public void getDistance() {
        double distance;
        for (Tower uneTour : context.getListTour()) {
            if (uneTour.getLvlTower() > 0) {

                distance = (mobB.getX() - uneTour.getX()) * (mobB.getX() - uneTour.getX()) + (mobB.getY() - uneTour.getY()) * (mobB.getY() - uneTour.getY());
                distance = Math.sqrt(distance);

                if (distance < 200) {
                    this.setLife(getLife() - (uneTour.getLvlTower() * 10));
                    if (mobB.getAlpha()<=0){
                        context.fenetrePrincipale.removeView(mobB);
                    }
                    mobB.setAlpha((float) (getLife()/1000));
                }
            }
        }
    }


    public void setLife(double life) {
        this.life = life;
    }


}

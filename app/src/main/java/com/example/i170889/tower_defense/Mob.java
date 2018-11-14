package com.example.i170889.tower_defense;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Mob {
    public String chemin[] = {"bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "gauche", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "droite", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas", "bas"};
    private String name;
    private int speed;
    private double life;
    private MainActivity context;
    private ImageView mobB;
    private float X;
    private float Y;
    private ViewGroup.LayoutParams params;
    private int position;
    private double baseLife;

    public Mob(MainActivity pContext, String name, double life, float X, float Y) {
        this.name = name;
        this.life = life;
        baseLife = life;
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
            context.setLose(true);
        }
        this.getDistance();
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
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

    public void setLife(double life) {
        this.life = life;
    }

    public void getDistance() {
        double distance;
        for (Tower uneTour : context.getListTour()) {
            if (uneTour.getLvlTower() > 0) {

                distance = (mobB.getX() - uneTour.getX()) * (mobB.getX() - uneTour.getX()) + (mobB.getY() - uneTour.getY()) * (mobB.getY() - uneTour.getY());
                distance = Math.sqrt(distance);

                if (distance < 200 && uneTour.getMobTarget() == null) {
                    uneTour.setMobTarget(this);
                    this.setLife(getLife() - uneTour.getDamage());
                    if (mobB.getAlpha() <= 0) {
                        uneTour.setMobTarget(null);
                        context.fenetrePrincipale.removeView(mobB);
                    }
                    mobB.setAlpha((float) (getLife() / baseLife));
                } else if (distance < 200 && uneTour.getMobTarget() == this) {
                    this.setLife(getLife() - uneTour.getDamage());
                    if (mobB.getAlpha() <= 0) {
                        uneTour.setMobTarget(null);
                        context.fenetrePrincipale.removeView(mobB);
                    }
                    mobB.setAlpha((float) (getLife() / baseLife));
                } else if (distance >= 200) {
                    uneTour.setMobTarget(null);
                }
            }

        }
    }


}

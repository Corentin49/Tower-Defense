package com.example.i170889.tower_defense;

import android.view.ViewGroup;
import android.widget.ImageButton;

public class Tower {

    private MainActivity context;
    private ImageButton towerImage;
    private ViewGroup.LayoutParams params;
    private boolean towerDetruite;
    private float X;
    private float Y;

    public Tower(MainActivity pcontext, float X, float Y){
        this.context = pcontext;
        towerDetruite = true;
        this.X = X;
        this.Y = Y;
        showTower();
    }

    public void showTower(){
        towerImage = new ImageButton(context);
        towerImage.setBackgroundResource(R.drawable.destroyedtower);

        params = new ViewGroup.LayoutParams(150, 150);
        towerImage.setLayoutParams(params);

        towerImage.setX(this.X);
        towerImage.setY(this.Y);

        context.fenetrePrincipale.addView(towerImage);
    }

    public void attaquer(Mob mobTarget){

    }


}

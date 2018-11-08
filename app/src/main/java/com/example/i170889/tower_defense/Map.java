package com.example.i170889.tower_defense;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private MainActivity context;
    private int position;
    private ImageView mapImage;
    private ViewGroup.LayoutParams params;
    private List<Map> listMap = new ArrayList<>();
    private String chemin[] = {"bas", "bas", "gauche", "gauche", "bas", "bas", "droite", "droite", "droite", "bas", "bas", "gauche", "gauche", "bas", "bas", "droite", "droite", "bas"};

    public Map(MainActivity pcontext) {
        this.context = pcontext;
        draw();
    }


    public void draw() {
        mapImage = new ImageButton(context);
        mapImage.setBackgroundResource(R.drawable.map);

        params = new ViewGroup.LayoutParams(110, 110);
        mapImage.setLayoutParams(params);

        mapImage.setX(360.f);
        mapImage.setY(0.0f);

        context.fenetrePrincipale.addView(mapImage);
    }

    public void creatMap() {


        for (int i = 0; chemin.length > i; i++) {

            Map map = new Map(this.context);
            listMap.add(map);

            if (this.chemin[i] == "bas") {
                mapImage.setY(mapImage.getY() + 110);
                Log.i("SA-PASSE", "BAS");
            } else if (this.chemin[i] == "gauche") {
                mapImage.setX(mapImage.getX() - 110);
                Log.i("SA-PASSE", "GAUCHE");
            } else if (this.chemin[i] == "droite") {
                mapImage.setX(mapImage.getX() + 110);
                Log.i("SA-PASSE", "DROITE");
            }
        }
        for (Map uneMap:listMap) {

        }

    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public ImageView getMapImage() {
        return mapImage;
    }

    public void setMapImage(ImageView mapImage) {
        this.mapImage = mapImage;
    }



}

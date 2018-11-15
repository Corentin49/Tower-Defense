package com.example.i170889.tower_defense;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class MusicManager {
    private Context context;
    private SoundPool soundPool;
    private int sonMort;

    public MusicManager(Context context) {
        super();
        this.context = context;
        this.soundPool = new SoundPool(50, AudioManager.STREAM_MUSIC, 0);
        this.sonMort = soundPool.load(context, R.raw.mort, 1);

    }

    public void jouerSonMort() {
        soundPool.play(this.sonMort, 1, 1, 1, 0, 1);
    }

}

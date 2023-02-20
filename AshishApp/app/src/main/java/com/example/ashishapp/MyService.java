package com.example.ashishapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    MediaPlayer player;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        player=MediaPlayer.create(this,R.raw.my_music);
        Toast.makeText(this, "onCreate call", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        player.stop();
        Toast.makeText(this, "onDestroy call", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }


}

package com.example.ashishapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class MyReceiver extends BroadcastReceiver {
MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the Notification is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
        mp=MediaPlayer.create(context,R.raw.my_music);
        mp.start();
        //Toast.makeText(context, " Notification Alarm", Toast.LENGTH_SHORT).show();
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("my_channel","Example ", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setShowBadge(true);
            NotificationManager notificationManager= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder mBuilder=(NotificationCompat.Builder) new NotificationCompat.Builder(context,"my_channel")
                .setSmallIcon(R.mipmap.ic_quiz)
                .setContentTitle("Alarm Notification")
                .setContentText("Alarm Started...");

        Intent notificationIntent= new Intent(context, AlarmBroadcastReceiver.class);
        PendingIntent intent1= PendingIntent.getActivity(context,0,notificationIntent,0);
        mBuilder.setContentIntent(intent1);

        NotificationManager notificationManager= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,mBuilder.build());
    }
}

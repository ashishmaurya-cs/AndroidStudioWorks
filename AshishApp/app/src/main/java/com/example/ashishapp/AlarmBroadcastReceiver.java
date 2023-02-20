package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlarmBroadcastReceiver extends AppCompatActivity {
Button btn11;
EditText time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_broadcast_receiver);
        btn11=findViewById(R.id.btn11);
        time=findViewById(R.id.time);
    }

    public void starAlarm(View view) {
        int i=Integer.parseInt(time.getText().toString());
        Intent intent= new Intent(this, MyReceiver.class);
        PendingIntent pendingIntent=PendingIntent.getBroadcast(this.getApplicationContext(),2,intent,0);
        AlarmManager alarmManager= (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+ (i* 1000), pendingIntent);
        Toast.makeText(this, "Alarm Set in"+i+"Seconds", Toast.LENGTH_SHORT).show();
    }
}

package com.example.hacunamatata.rikkeisoft_broadcastsender;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAppA(View view) {
        String action = "com.example.hacuanamata.CALL_A";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setComponent(
                new ComponentName("com.example.hacunamatata.rikkeisoft_broadcastreceiver_a",
                        "com.example.hacunamatata.rikkeisoft_broadcastreceiver_a.BroadcastA"));
        intent.putExtra("Message", "Hello A");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }

    public void goToAppB(View view) {
        String action = "com.example.hacuanamata.CALL_SUB_B";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setComponent(
                new ComponentName("com.example.hacunamatata.rikkeisoft_broadcasrreceiver_b",
                        "com.example.hacunamatata.rikkeisoft_broadcasrreceiver_b.BroadcastB"));
        intent.putExtra("Message to B", "Hello Sub B");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }
}

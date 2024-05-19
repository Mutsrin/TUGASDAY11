package com.example.tugasd11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton chat, job, notif, network;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        chat = findViewById(R.id.chat);
        job = findViewById(R.id.job);
        notif = findViewById(R.id.notif);
        network = findViewById(R.id.network);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchat = new Intent (MainActivity.this,com.example.tugasd11.chat.class);
                startActivity(intentchat);
            }
        });



        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentjob = new Intent( MainActivity.this,Jobs.class);
                startActivity(intentjob);
            }
        });



        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnotif = new Intent(MainActivity.this,Notif.class);
                startActivity(intentnotif);
            }
        });



        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnetwork = new Intent(MainActivity.this,Network.class);
                startActivity(intentnetwork);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

    }
}
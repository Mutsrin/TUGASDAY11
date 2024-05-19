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

public class Network extends AppCompatActivity {

    ImageButton chat,  notif, job, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_network);

        chat = findViewById(R.id.chat);
        home = findViewById(R.id.home);
        notif = findViewById(R.id.notif);
        job = findViewById(R.id.job);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchat = new Intent (Network.this,com.example.tugasd11.chat.class);
                startActivity(intentchat);
            }
        });



        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentjob = new Intent( Network.this,Jobs.class);
                startActivity(intentjob);
            }
        });



        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnotif = new Intent(Network.this,Notif.class);
                startActivity(intentnotif);
            }
        });



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnetwork = new Intent(Network.this,MainActivity.class);
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
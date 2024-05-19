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

public class Notif extends AppCompatActivity {

    ImageButton chat,  Network, job, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notif);

        chat = findViewById(R.id.chat);
        home = findViewById(R.id.home);
        Network = findViewById(R.id.network);
        job = findViewById(R.id.job);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchat = new Intent (Notif.this,com.example.tugasd11.chat.class);
                startActivity(intentchat);
            }
        });



        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentjob = new Intent( Notif.this,Jobs.class);
                startActivity(intentjob);
            }
        });



        Network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnotif = new Intent(Notif.this,Network.class);
                startActivity(intentnotif);
            }
        });



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnetwork = new Intent(Notif.this,MainActivity.class);
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
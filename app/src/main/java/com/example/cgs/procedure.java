package com.example.cgs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class procedure extends AppCompatActivity {
public Button b,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure);
        b=findViewById(R.id.back2);
        link=findViewById(R.id.link);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(procedure.this,nxt1.class);
                startActivity(i);
            }
        });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Q6T6hKFvT10"));
                startActivity(launchxeb);
            }
        });
    }
}
package com.example.cgs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class purchase extends AppCompatActivity {
private Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);
        b1=findViewById(R.id.rb1);
        b2=findViewById(R.id.rb2);
        b3=findViewById(R.id.rb3);
        b4=findViewById(R.id.rb4);
        b5=findViewById(R.id.rb5);
        b6=findViewById(R.id.rb6);
        b7=findViewById(R.id.rb7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/hfhwtxpk/?referralCode=BDE94336B3B92842FBE8"));
                startActivity(launchxeb);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/yeegvrvz/"));
                startActivity(launchxeb);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/jwlslplp/"));
                startActivity(launchxeb);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/xomtrqgh/"));
                startActivity(launchxeb);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/fwkqizhl/?referralCode=68FAB7B9728965E92B83"));
                startActivity(launchxeb);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchxeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/quick-way-to-learn-english-typing-for-beginners-in-tamil/"));
                startActivity(launchxeb);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(purchase.this,nxt1.class);
                                startActivity(i);
            }
        });
    }
}
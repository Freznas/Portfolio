package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
//    deklarerar variabler
    Button Design;
    Button Instagram;
    Button Programming;
    Button LinkedIn;
    Button Hobbies;
    Button GitHub;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//tilldelar dem värden som hämtas från resurser som används i XMLen
        mediaPlayer = MediaPlayer.create(this, R.raw.mountains);
        mediaPlayer.start();
        Design = findViewById(R.id.btn_design);
        Instagram = findViewById(R.id.btn_instagram);
        Programming = findViewById(R.id.btn_programming);
        LinkedIn = findViewById(R.id.btn_linkedin);
        Hobbies = findViewById(R.id.btn_hobbies);
        GitHub = findViewById(R.id.btn_github);

        Design.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "SUCCESS!", Toast.LENGTH_LONG).show();
                Intent newDesignIntent = new Intent(MainActivity.this, New_Design.class);

                startActivity(newDesignIntent);
            }
        });

        Hobbies.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "SUCCESS!", Toast.LENGTH_LONG).show();
                Intent newHobbiesIntent = new Intent(MainActivity.this, New_Hobbies.class);

                startActivity(newHobbiesIntent);
            }
        });
        Programming.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                Toast.makeText(MainActivity.this, "SUCCESS!", Toast.LENGTH_LONG).show();
                Intent newProgrammingIntent = new Intent(MainActivity.this, New_Programming.class);

                startActivity(newProgrammingIntent);
            }
        });
        Instagram.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/joakim_karl/"));
                startActivity(intent);
            }
        });
        LinkedIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/joakim-bj%C3%A4rkstedt-57294b99/"));
                startActivity(intent);
            }
        });
        GitHub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/Freznas"));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStop()
    {
        super.onStop();
        mediaPlayer.release();
    }
}



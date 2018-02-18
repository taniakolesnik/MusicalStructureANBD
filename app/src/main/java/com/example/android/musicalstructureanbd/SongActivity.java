package com.example.android.musicalstructureanbd;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by tetianakolesnik on 18/02/2018.
 */

public class SongActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        ImageView imageView = (ImageView) findViewById(R.id.home_imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

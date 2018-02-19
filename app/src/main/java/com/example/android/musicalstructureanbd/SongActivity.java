package com.example.android.musicalstructureanbd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tetianakolesnik on 18/02/2018.
 */

public class SongActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String singer = bundle.getString("singer");
        int duration = bundle.getInt("duration");

        TextView song_title = (TextView) findViewById(R.id.song_title);
        song_title.setText(title);

        TextView song_singer = (TextView) findViewById(R.id.song_singer);
        song_singer.setText(singer);

        TextView song_duration = (TextView) findViewById(R.id.song_duration);
        song_duration.setText(String.valueOf(duration));


        ImageView imageView = (ImageView) findViewById(R.id.songPage_homeImageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

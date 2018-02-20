package com.example.android.musicalstructureanbd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tetianakolesnik on 18/02/2018.
 */

public class SongActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String singer = bundle.getString("singer");
        int duration = bundle.getInt("duration");
        String playStoreLink = bundle.getString("playStoreLink");
        int thumbnail = bundle.getInt("thumbnail");

        ImageView thumbnailView = (ImageView) findViewById(R.id.song_thumbnail);
        thumbnailView.setImageResource(thumbnail);

        TextView titleView = (TextView) findViewById(R.id.song_title);
        titleView.setText(title);

        TextView singerView = (TextView) findViewById(R.id.song_singer);
        singerView.setText(singer);

        TextView durationView = (TextView) findViewById(R.id.song_duration);
        durationView.setText(String.valueOf(duration));

        TextView playStoreLinkView = (TextView) findViewById(R.id.playStoreLink);
        playStoreLinkView.setText(String.valueOf(playStoreLink));


        ImageView homeView = (ImageView) findViewById(R.id.songPage_homeImageView);
        ImageView playView = (ImageView) findViewById(R.id.songPage_playmageView);
        ImageView favouriteView = (ImageView) findViewById(R.id.songPage_favouriteImageView);

        homeView.setOnClickListener(this);
        playView.setOnClickListener(this);
        favouriteView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.songPage_homeImageView:
                Intent intent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.songPage_playmageView:
                Toast.makeText(SongActivity.this, "Let's imagine this song is being played now",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.songPage_favouriteImageView:
                Toast.makeText(SongActivity.this, "Song has been added to favourites!",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}

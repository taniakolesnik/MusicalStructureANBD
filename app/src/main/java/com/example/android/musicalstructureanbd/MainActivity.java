package com.example.android.musicalstructureanbd;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView searchImageView = (ImageView) findViewById(R.id.mainPage_SearchImageView);
        searchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearhActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(getString(R.string.songOneTitle), getString(R.string.songOneSinger), 0,
                getString(R.string.songOnePlayStoreLink), 0));
        songs.add(new Song(getString(R.string.songTwoTitle), getString(R.string.songTwoSinger), 1,
                getString(R.string.songTwoPlayStoreLink), 0));
        songs.add(new Song(getString(R.string.songThreeTitle), getString(R.string.songThreeSinger), 1,
                getString(R.string.songThreePlayStoreLink), 0));
        songs.add(new Song(getString(R.string.songFourTitle), getString(R.string.songFourSinger), 1,
                getString(R.string.songFourPlayStoreLink), 0));

        final ListView listView = (ListView) findViewById(R.id.list_view);
        final SongArrayAdapter arrayAdapter = new SongArrayAdapter(this, songs);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SongActivity.class);
                intent.putExtra("title", arrayAdapter.getItem(position).getmTitle());
                intent.putExtra("singer", arrayAdapter.getItem(position).getmSinger());
                intent.putExtra("duration", arrayAdapter.getItem(position).getmDuration());
                startActivity(intent);
            }
        });

    }

    private class SongArrayAdapter extends ArrayAdapter<Song> {

        public SongArrayAdapter(Context context, ArrayList<Song> songs) {
            super(context, 0, songs);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null)
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.song_list_item, parent, false);

            Song currentSong = getItem(position);

            TextView song_title = (TextView) listItemView.findViewById(R.id.song_list_title);
            song_title.setText(currentSong.getmTitle());

            TextView singer = (TextView) listItemView.findViewById(R.id.song_list_singer);
            singer.setText(currentSong.getmSinger());

            return listItemView;
        }
    }
}


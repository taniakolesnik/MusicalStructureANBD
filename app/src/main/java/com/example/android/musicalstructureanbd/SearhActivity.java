package com.example.android.musicalstructureanbd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by tetianakolesnik on 19/02/2018.
 */

public class SearhActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);


        ImageView searchImageView = (ImageView) findViewById(R.id.searchPage_searchImage);
        searchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText searchEditText = (EditText) findViewById(R.id.searchPage_editText);
                String searchItem = searchEditText.getText().toString();
                if (TextUtils.isEmpty(searchItem)){
                    Toast.makeText(SearhActivity.this, "You haven't specify what you want to search. " +
                            "Please type search criterion and press search icon.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(SearhActivity.this, "Search doesn't work! Check for \"" +
                            searchEditText.getText() + "\" in Google.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView homeImageView = (ImageView) findViewById(R.id.searchPage_homeImage);
        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearhActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

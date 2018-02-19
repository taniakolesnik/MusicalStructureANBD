package com.example.android.musicalstructureanbd;

import java.util.Date;

/**
 * Created by tetianakolesnik on 18/02/2018.
 */

public class Song {

    private String mTitle;
    private String mSinger;
    private int mDuration;
    private String mPlayStoreLink;
    private int mThumbnail;

    public Song(String mTitle, String mSinger, int mDuration, String mPlayStoreLink, int mThumbnail) {
        this.mTitle = mTitle;
        this.mSinger = mSinger;
        this.mDuration = mDuration;
        this.mPlayStoreLink = mPlayStoreLink;
        this.mThumbnail=mThumbnail;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSinger() {
        return mSinger;
    }

    public int getmDuration() {
        return mDuration;
    }

    public String getmPlayStoreLink() {
        return mPlayStoreLink;
    }

    public int getmThumbnail() {
        return mThumbnail;
    }

}

package com.example.android.dhunplayer;

public class Playlist {

    private String song;

    private String singer;

    private String duration;

    public Playlist(String song, String singer, String duration) {

        this.song = song;
        this.singer = singer;
        this.duration = duration; }

    public String getSong() { return song; }

    public String getSinger() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }

}


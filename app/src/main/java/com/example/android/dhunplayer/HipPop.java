package com.example.android.dhunplayer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HipPop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_all);
        ArrayList<Playlist> playlist = new ArrayList<>();

        playlist.add(new Playlist("Classic Pimpin","8Ball & MJG","4:26"));
        playlist.add(new Playlist("Bawskee 2","Comethazine","3:37"));
        playlist.add(new Playlist("Complaint","Watsky","4:00"));
        playlist.add(new Playlist("TDT","Big K.R.I.T","3:50"));

        ListView songsListView = findViewById(R.id.list);
        PlaylistAdapter songsAdapter = new PlaylistAdapter(this,playlist);
        songsListView.setAdapter(songsAdapter);
        // For Showing Toast Message
        Toast.makeText(getApplicationContext(), "Now Playing TDT", Toast.LENGTH_SHORT).show();

    }
}

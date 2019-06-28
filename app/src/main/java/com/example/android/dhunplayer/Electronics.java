package com.example.android.dhunplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Electronics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_all);
        ArrayList<Playlist> playlist = new ArrayList<>();

        playlist.add(new Playlist("Spaceman","Hardwell","4:26"));
        playlist.add(new Playlist("Rattle - Original Instrumental","Bingo Players","3:37"));
        playlist.add(new Playlist("Epic - Original Mix","S Silva, Quintino","4:00"));
        playlist.add(new Playlist("Pursuit Of Happiness ","Kid Cudi","3:50"));

        ListView songsListView = findViewById(R.id.list);
        PlaylistAdapter songsAdapter = new PlaylistAdapter(this,playlist);
        songsListView.setAdapter(songsAdapter);
        // For Showing Toast Message
        Toast.makeText(getApplicationContext(),"Now Playing Spaceman",Toast.LENGTH_SHORT).show();
    }
}

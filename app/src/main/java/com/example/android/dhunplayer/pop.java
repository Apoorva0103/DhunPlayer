package com.example.android.dhunplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_all);
        //create an array of playlist//

        ArrayList<Playlist> playlist = new ArrayList<>();

        playlist.add(new Playlist("Without Me","Halsey","4:26"));
        playlist.add(new Playlist("Sucker","Jonas Brothers","3:37"));
        playlist.add(new Playlist("If i Can't Have You","Shawn Mendles","4:00"));
        playlist.add(new Playlist("I'm Bored","Ariana","3:50"));

        ListView songsListView = findViewById(R.id.list);

        PlaylistAdapter songsAdapter = new PlaylistAdapter(this,playlist);

        songsListView.setAdapter(songsAdapter);
        // For Showing Toast Message
        Toast.makeText(getApplicationContext(),"Now Playing Without Me",Toast.LENGTH_SHORT).show();
    }
}

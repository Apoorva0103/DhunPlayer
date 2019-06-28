package com.example.android.dhunplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class jazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_all);
        ArrayList<Playlist> playlist = new ArrayList<>();

        playlist.add(new Playlist("Kind of blue","Miles Davis","4:26"));
        playlist.add(new Playlist("A Love Supreme","John Coltrane","3:37"));
        playlist.add(new Playlist("Brilliant corners","Monk","4:00"));
        playlist.add(new Playlist("In a Silent Way","Miles Davis","3:50"));

        ListView songsListView = findViewById(R.id.list);

        PlaylistAdapter songsAdapter = new PlaylistAdapter(this,playlist);

        songsListView.setAdapter(songsAdapter);
        // For Showing Toast Message
        Toast.makeText(getApplicationContext(),"Now Playing Kind of blue",Toast.LENGTH_SHORT).show();
    }
}

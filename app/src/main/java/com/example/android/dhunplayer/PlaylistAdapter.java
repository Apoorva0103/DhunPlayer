package com.example.android.dhunplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.dhunplayer.Playlist;
import com.example.android.dhunplayer.R;

import java.util.ArrayList;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {

    public PlaylistAdapter(Activity context, ArrayList<Playlist> playlists) {
        super(context, 0, playlists);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link song} object located at this position in the list
        Playlist currentplaylist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView =  listItemView.findViewById(R.id.song_text_view);
        // Get the version name from the current song object and
        // set this text on the name TextView
      songTextView.setText(currentplaylist.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView singerTextView =  listItemView.findViewById(R.id.singer_text_view);
        // Get the version number from the current singer object and
        // set this text on the number TextView
       singerTextView.setText(currentplaylist.getSinger());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView durationTextView =  listItemView.findViewById(R.id.duration_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        durationTextView.setText(currentplaylist.getDuration());

        return listItemView;
    }



}



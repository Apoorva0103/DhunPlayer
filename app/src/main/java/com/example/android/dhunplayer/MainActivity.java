package com.example.android.dhunplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // find the view that shows the pop category

        TextView pop = (TextView) findViewById(R.id.pop);

        // set a click listener on that view

        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link pop}
                Intent popIntent = new Intent(MainActivity.this, pop.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });


        // find the view that shows the Jazz category

         TextView jazz = findViewById(R.id.jazz);

        // set a click listener on that view
    jazz.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the pop category is clicked on.
        @Override
        public void onClick(View v) {
            // Create a new intent to open the {@link jazz}
       Intent jazzIntent = new Intent(MainActivity.this, jazz.class);

       // Start the new Activity
            startActivity(jazzIntent);

        }
    });

        // find the view that shows the electronics category

        TextView Electronics = findViewById(R.id.Electronics);

        // set a click listner on that view

        Electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ElectronicsIntent = new Intent(MainActivity.this, Electronics.class);

                //Start a new Activity

                startActivity(ElectronicsIntent);
            }
        });

        // find the view that shows the electronics category
        final TextView HipPop = findViewById(R.id.hip_pop);

        //set the click listner on that view

        HipPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hip_popIntent = new Intent(MainActivity.this,HipPop.class);

                // start a new intent
                startActivity(Hip_popIntent);
            }
        });

    }



}




package com.cheguza.mymusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button songs_1=(Button) findViewById(R.id.bt2);

        songs_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent_1 = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent_1);
            }
        });

        Button playlist_1=(Button) findViewById(R.id.bt1);
        playlist_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent_1 = new Intent(AlbumsActivity.this, PlaylistActivity.class);
                startActivity(playIntent_1);
            }
        });

        Button artist_1=(Button) findViewById(R.id.bt3);
        artist_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent_1 = new Intent(AlbumsActivity.this, ArtistActivity.class);
                startActivity(artistIntent_1);
            }
        });

    }
}

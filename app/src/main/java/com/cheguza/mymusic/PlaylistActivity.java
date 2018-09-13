package com.cheguza.mymusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button songs_1=(Button) findViewById(R.id.bt2);

        songs_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent_1 = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent_1);
            }
        });

        Button albums_1=(Button) findViewById(R.id.bt1);
        albums_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent_1 = new Intent(PlaylistActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent_1);
            }
        });

        Button artist_1=(Button) findViewById(R.id.bt3);
        artist_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent_1 = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent_1);
            }
        });
    }
}

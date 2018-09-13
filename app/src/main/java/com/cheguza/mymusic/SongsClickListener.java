package com.cheguza.mymusic;
import android.view.View;
import android.widget.Toast;

public class SongsClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                "Open The List Of Songs",
                Toast.LENGTH_SHORT).show();
    }
}

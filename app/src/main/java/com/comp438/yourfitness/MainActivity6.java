package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        VideoView videoView = findViewById(R.id.videoView);
        String Vediopath = "android.resource://" +getPackageName() +"/" +R.raw.video;
        Uri uri = Uri.parse(Vediopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(MainActivity6.this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}
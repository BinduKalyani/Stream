package com.bindu.stream;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class EarnedIt extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earned_it);
        MediaController mediaController=new MediaController(this);
        videoView=findViewById(R.id.film2);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");

        videoView.setVideoURI(uri);
        videoView.start();

    }
}
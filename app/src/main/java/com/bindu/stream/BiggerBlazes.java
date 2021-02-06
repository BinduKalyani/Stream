package com.bindu.stream;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class BiggerBlazes extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigger_blazes);
        MediaController mediaController=new MediaController(this);
        videoView=findViewById(R.id.film3);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4");

        videoView.setVideoURI(uri);
        videoView.start();

    }
}
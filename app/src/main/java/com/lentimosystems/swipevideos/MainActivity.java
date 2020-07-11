package com.lentimosystems.swipevideos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.viewPagerVideos);
        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem item = new VideoItem();
        item.videoURL = "https://liciolentimo.co.ke/img/videos/facebook.mp4";
        item.videoTitle = "Women In Tech";
        item.videoDesc = "International Women's Day 2019";
        videoItems.add(item);

        VideoItem item2 = new VideoItem();
        item2.videoURL = "https://liciolentimo.co.ke/img/videos/facebook3.mp4";
        item2.videoTitle = "Sasha Solomon";
        item2.videoDesc = "How Sasha Solomon Became a Software Developer at Twitter";
        videoItems.add(item2);
////
        VideoItem item3 = new VideoItem();
        item3.videoURL = "https://liciolentimo.co.ke/img/videos/facebook2.mp4";
        item3.videoTitle = "Happy Hour Wednesday";
        item3.videoDesc = " Depth-First Search Algorithm";
        videoItems.add(item3);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}
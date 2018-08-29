package com.sayan.sample.diagonalcutviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDevlight();
    }

    private void setupDevlight() {
        //      final VerticalInfiniteCycleViewPager infiniteCycleViewPager =
//                (VerticalInfiniteCycleViewPager) view.findViewById(R.id.vicvp);
        final HorizontalInfiniteCycleViewPager infiniteCycleViewPager =
                (HorizontalInfiniteCycleViewPager) findViewById(R.id.devlightView);
        infiniteCycleViewPager.setAdapter(new CustomPagerAdapter(this));
//        infiniteCycleViewPager.setScrollDuration(500);
//        infiniteCycleViewPager.setInterpolator(...);
//        infiniteCycleViewPager.setMediumScaled(true);
//        infiniteCycleViewPager.setMaxPageScale(0.8F);
//        infiniteCycleViewPager.setMinPageScale(0.5F);
//        infiniteCycleViewPager.setCenterPageScaleOffset(30.0F);
//        infiniteCycleViewPager.setMinPageScaleOffset(5.0F);
//        infiniteCycleViewPager.setOnInfiniteCyclePageTransformListener(...);
    }
}

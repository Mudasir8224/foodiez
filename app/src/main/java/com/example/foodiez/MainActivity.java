package com.example.foodiez;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.foodiez.Fragments.HeartFragment;
import com.example.foodiez.Fragments.HomeFragment;
import com.example.foodiez.Fragments.LocationFragment;
import com.example.foodiez.Fragments.ProfileFragment;
import com.example.foodiez.Helper.FragmentManager;
import com.example.foodiez.Views.ViewPagerV2;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentAdapter;
    ImageView imageViewFirst;
    ImageView imageViewSecond;
    ImageView imageViewThird;
    ImageView imageViewFourth;
    ViewPagerV2 mViewPager;
    LinearLayout linearLayoutFirst;
    LinearLayout linearLayoutSecond;
    LinearLayout linearLayoutThird;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        init();
        setupFragment();
        businessLogic();

    }

    public void businessLogic (){

        imageViewFirst.setColorFilter( Color.parseColor( "#FFCC2A" ) );
        imageViewSecond.setColorFilter( Color.BLACK );
        imageViewThird.setColorFilter( Color.BLACK );
        imageViewFourth.setColorFilter( Color.BLACK );
    }

    private void init (){

        imageViewFirst = findViewById(R.id.imageViewFirst);
        imageViewSecond = findViewById( R.id.imageViewSecond );
        imageViewThird = findViewById( R.id.imageViewThird );
        imageViewFourth = findViewById( R.id.imageViewFourth );
        mViewPager = findViewById(R.id.myViewPager);
        linearLayoutFirst = findViewById( R.id.layoutParentFirst );

    }

    private void setupFragment(){

        this.fragmentAdapter = new FragmentManager(getSupportFragmentManager());
        this.fragmentAdapter.addFragments(new HomeFragment() );
        this.fragmentAdapter.addFragments( new LocationFragment() );
        this.fragmentAdapter.addFragments( new HeartFragment() );
        this.fragmentAdapter.addFragments( new ProfileFragment() );
        mViewPager.setAdapter(fragmentAdapter);
        mViewPager.disableScroll(true);
        clickEvents();

    }

    private void clickEvents(){
        imageViewFirst.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewPager.setCurrentItem(0,true);

                imageViewFirst.setColorFilter( Color.parseColor( "#FFCC2A" ) );
                imageViewSecond.setColorFilter( Color.BLACK );
                imageViewThird.setColorFilter( Color.BLACK );
                imageViewFourth.setColorFilter( Color.BLACK );

            }
        } );

        imageViewSecond.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewPager.setCurrentItem(1,true);

                imageViewFirst.setColorFilter( Color.BLACK );
                imageViewSecond.setColorFilter( Color.parseColor( "#FFCC2A" ) );
                imageViewThird.setColorFilter( Color.BLACK );
                imageViewFourth.setColorFilter( Color.BLACK );

            }
        } );

        imageViewThird.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewPager.setCurrentItem(2,true);

                imageViewFirst.setColorFilter( Color.BLACK );
                imageViewThird.setColorFilter( Color.parseColor( "#FFCC2A" ) );
                imageViewSecond.setColorFilter( Color.BLACK );
                imageViewFourth.setColorFilter( Color.BLACK );

            }
        } );

        imageViewFourth.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewPager.setCurrentItem(3,true);

                imageViewFirst.setColorFilter( Color.BLACK );
                imageViewThird.setColorFilter( Color.BLACK);
                imageViewSecond.setColorFilter( Color.BLACK );
                //imageViewFourth.setColorFilter( Color.YELLOW );
                imageViewFourth.setColorFilter( Color.parseColor( "#FFCC2A" ) );

            }
        } );


    }
}

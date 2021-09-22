package com.example.foodiez.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodiez.Adapters.ImageSliderAdapter;
import com.example.foodiez.Adapters.MealDealsAdapter;
import com.example.foodiez.Adapters.MostPopularAdapter;
import com.example.foodiez.ModelClasses.MealDealsData;
import com.example.foodiez.ModelClasses.MostPopularData;
import com.example.foodiez.R;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    SliderView sliderView;
    RecyclerView recyclerViewMostPopular;
    RecyclerView recyclerViewMealDeals;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.fragment_home, container, false );
        sliderView = rootView.findViewById( R.id.imageSlider );
        recyclerViewMostPopular = rootView.findViewById( R.id.recyclerViewHomePopular );
        recyclerViewMealDeals = rootView.findViewById( R.id.recyclerViewHomeMeal );
        setSliderView();
        setRecyclerViewMostPopular();
        setRecyclerViewMealDeals();
        return rootView;
    }

    private void setSliderView() {
        sliderView.setSliderAdapter( new ImageSliderAdapter( getContext() ) );
    }

    private void setRecyclerViewMostPopular() {
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        layoutManager.setOrientation( LinearLayoutManager.HORIZONTAL );
        recyclerViewMostPopular.setLayoutManager( layoutManager );
        List<MostPopularData> mostPopularDataList = new ArrayList<>();
        mostPopularDataList.add( new MostPopularData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mostPopularDataList.add( new MostPopularData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        mostPopularDataList.add( new MostPopularData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mostPopularDataList.add( new MostPopularData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        mostPopularDataList.add( new MostPopularData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mostPopularDataList.add( new MostPopularData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        MostPopularAdapter mostPopularAdapter = new MostPopularAdapter( mostPopularDataList, getContext() );
        recyclerViewMostPopular.setAdapter( mostPopularAdapter );

    }

    private void setRecyclerViewMealDeals() {
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        layoutManager.setOrientation( LinearLayoutManager.HORIZONTAL );
        recyclerViewMealDeals.setLayoutManager( layoutManager );
        List<MealDealsData> mealDealsData = new ArrayList<>();
        mealDealsData.add( new MealDealsData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mealDealsData.add( new MealDealsData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        mealDealsData.add( new MealDealsData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mealDealsData.add( new MealDealsData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        mealDealsData.add( new MealDealsData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        mealDealsData.add( new MealDealsData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        MealDealsAdapter mealDealsAdapter = new MealDealsAdapter( mealDealsData, getContext() );
        recyclerViewMealDeals.setAdapter( mealDealsAdapter );

    }
}


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

import com.example.foodiez.Adapters.MostPopularAdapter;
import com.example.foodiez.Adapters.PhotoFoodAdapter;
import com.example.foodiez.Adapters.ProfileReviewAdapter;
import com.example.foodiez.ModelClasses.MostPopularData;
import com.example.foodiez.ModelClasses.PhotoData;
import com.example.foodiez.ModelClasses.ProfileReviewData;
import com.example.foodiez.R;

import java.util.ArrayList;
import java.util.List;


public class LocationFragment extends Fragment {
RecyclerView recyclerViewPhoto;
RecyclerView recyclerViewReviewProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.fragment_location, container, false );

        recyclerViewPhoto = rootView.findViewById( R.id.recyclerViewLocationFirst );
        recyclerViewReviewProfile = rootView.findViewById( R.id.recyclerViewLocationSecond );
        setupPhotoRv();
        setupProfileReviewRv();
        return rootView;
    }

    private  void setupPhotoRv (){
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        layoutManager.setOrientation( LinearLayoutManager.HORIZONTAL );
        recyclerViewPhoto.setLayoutManager( layoutManager );
        List<PhotoData> photoDataList = new ArrayList<>();
        photoDataList.add( new PhotoData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        photoDataList.add( new PhotoData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        photoDataList.add( new PhotoData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        photoDataList.add( new PhotoData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        photoDataList.add( new PhotoData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        photoDataList.add( new PhotoData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        PhotoFoodAdapter photoFoodAdapter = new PhotoFoodAdapter( photoDataList, getContext() );
        recyclerViewPhoto.setAdapter( photoFoodAdapter );

    }

    private  void setupProfileReviewRv (){
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        layoutManager.setOrientation( LinearLayoutManager.VERTICAL );
        recyclerViewReviewProfile.setLayoutManager( layoutManager );
        List<ProfileReviewData> profileReviewDataList = new ArrayList<>();
        profileReviewDataList.add( new ProfileReviewData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        profileReviewDataList.add( new ProfileReviewData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        profileReviewDataList.add( new ProfileReviewData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        profileReviewDataList.add( new ProfileReviewData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        profileReviewDataList.add( new ProfileReviewData( "KFC","https://images.unsplash.com/photo-1513639304702-9116ea240a81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1047&q=80" ) );
        profileReviewDataList.add( new ProfileReviewData( "McDonald's", "https://images.unsplash.com/photo-1556637641-0ac7101023f9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80" ) );
        ProfileReviewAdapter profileReviewAdapter = new ProfileReviewAdapter( profileReviewDataList, getContext() );
        recyclerViewReviewProfile.setAdapter( profileReviewAdapter );

    }

}

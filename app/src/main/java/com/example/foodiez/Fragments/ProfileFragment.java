package com.example.foodiez.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.foodiez.LoginActivity;
import com.example.foodiez.R;
import com.example.foodiez.SignUpActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    Button buttonLoginProfile;
    Button buttonSignUpProfile;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.fragment_profile, container, false );

        buttonLoginProfile = rootView.findViewById( R.id.buttonLoginProfile );
        buttonSignUpProfile = rootView.findViewById( R.id.buttonSignUpProfile );

        buttonLoginProfile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), LoginActivity.class );
                startActivity( intent );
            }
        } );

        buttonSignUpProfile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), SignUpActivity.class );
                startActivity( intent );
            }
        } );

        return rootView;
    }

}

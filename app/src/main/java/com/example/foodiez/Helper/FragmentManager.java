package com.example.foodiez.Helper;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentManager extends FragmentPagerAdapter {

  private  List <Fragment> fragmentList;

    public FragmentManager(@NonNull androidx.fragment.app.FragmentManager fm) {
        super( fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );
        this.fragmentList = new ArrayList<>();
    }

    public  void addFragments(Fragment fragment){
        this.fragmentList.add( fragment );
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get( position );
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      //  super.destroyItem( container, position, object );
    }
}

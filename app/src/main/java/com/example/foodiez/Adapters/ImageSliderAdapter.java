package com.example.foodiez.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.foodiez.R;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.zip.Inflater;

public class ImageSliderAdapter extends SliderViewAdapter<ImageSliderAdapter.viewHolderImageSlider> {

    Context context;

    public ImageSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public viewHolderImageSlider onCreateViewHolder(ViewGroup parent) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate( R.layout.image_slider,null);
        return new viewHolderImageSlider(rootView) ;
    }

    @Override
    public void onBindViewHolder(viewHolderImageSlider viewHolder, int position) {

        switch (position){

            case 0:

                Picasso.get().load("https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80").into( viewHolder.imageView);
               break;

            case  1:

                Picasso.get().load( "https://images.unsplash.com/photo-1561402803-22dcfef7a089?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80" ).into(viewHolder.imageView);
                break;

            case  2:
                Picasso.get().load( "https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80" ).into(viewHolder.imageView);
                break;

            default:

                Picasso.get().load( "https://images.unsplash.com/photo-1571531900150-474b57bf1658?ixlib=rb-1.2.1&auto=format&fit=crop&w=675&q=80" ).into(viewHolder.imageView);
                break;

        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    class viewHolderImageSlider extends SliderViewAdapter.ViewHolder {
        ImageView imageView;
        public viewHolderImageSlider(View itemView) {
            super( itemView );

            imageView = itemView.findViewById( R.id.imageViewBackgroundSlider);
        }
    }

}



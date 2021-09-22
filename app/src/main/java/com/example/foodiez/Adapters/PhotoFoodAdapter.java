package com.example.foodiez.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodiez.ModelClasses.MealDealsData;
import com.example.foodiez.ModelClasses.PhotoData;
import com.example.foodiez.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PhotoFoodAdapter extends RecyclerView.Adapter<PhotoFoodAdapter.viewHolderPhoto> {

    List<PhotoData> photoDataList;
    private Context context;

    public PhotoFoodAdapter(List<PhotoData> photoDataList, Context context) {
        this.photoDataList = photoDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderPhoto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate( R.layout.photo_food_rv,parent,false);
        return new viewHolderPhoto(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderPhoto holder, final int position) {
        final PhotoData photoData = photoDataList.get(position);
        holder.name.setText(photoData.getFoodCategory());
        Picasso.get().load(photoData.getImgUrl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  photoDataList.size();
    }

    public class viewHolderPhoto extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        public viewHolderPhoto(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageViewPhotoCategoryRv );
            name = itemView.findViewById( R.id.textViewPhotoCategoryName );
        }
    }
}

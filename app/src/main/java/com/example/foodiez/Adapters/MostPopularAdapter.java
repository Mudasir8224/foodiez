package com.example.foodiez.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodiez.ModelClasses.MostPopularData;
import com.example.foodiez.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MostPopularAdapter extends RecyclerView.Adapter<MostPopularAdapter.viewHolderMostPopular> {

    List<MostPopularData> mostPopularDataList;
    private Context context;

    public MostPopularAdapter(List<MostPopularData> mostPopularDataList, Context context) {
        this.mostPopularDataList = mostPopularDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderMostPopular onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate( R.layout.most_popular_rv,parent,false);
        return new viewHolderMostPopular(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderMostPopular holder, final int position) {
        final MostPopularData mostPopularData = mostPopularDataList.get(position);
        holder.name.setText(mostPopularData.getHotelName());
        Picasso.get().load(mostPopularData.getImgUrl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  mostPopularDataList.size();
    }

    public class viewHolderMostPopular extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        public viewHolderMostPopular(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageViewMostPopular );
            name = itemView.findViewById( R.id.textViewHotelName );
        }
    }
}

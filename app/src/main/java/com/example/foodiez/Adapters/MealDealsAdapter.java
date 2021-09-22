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
import com.example.foodiez.ModelClasses.MostPopularData;
import com.example.foodiez.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MealDealsAdapter extends RecyclerView.Adapter<MealDealsAdapter.viewHolderMealsDeals> {

    List<MealDealsData> mealDealsDataList;
    private Context context;

    public MealDealsAdapter(List<MealDealsData> mealDealsDataList, Context context) {
        this.mealDealsDataList = mealDealsDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderMealsDeals onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate( R.layout.meal_deals_rv,parent,false);
        return new viewHolderMealsDeals(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderMealsDeals holder, final int position) {
        final MealDealsData mealDealsData = mealDealsDataList.get(position);
        holder.name.setText(mealDealsData.getFoodName());
        Picasso.get().load(mealDealsData.getImgUrl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  mealDealsDataList.size();
    }

    public class viewHolderMealsDeals extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        public viewHolderMealsDeals(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageViewMealDeal );
            name = itemView.findViewById( R.id.textViewFoodName );
        }
    }
}

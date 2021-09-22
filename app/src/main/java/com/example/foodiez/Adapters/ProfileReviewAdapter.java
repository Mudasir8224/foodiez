package com.example.foodiez.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodiez.ModelClasses.PhotoData;
import com.example.foodiez.ModelClasses.ProfileReviewData;
import com.example.foodiez.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProfileReviewAdapter extends RecyclerView.Adapter<ProfileReviewAdapter.viewHolderProfileReview> {

    List<ProfileReviewData> profileReviewDataList;
    private Context context;

    public ProfileReviewAdapter(List<ProfileReviewData> profileReviewDataList, Context context) {
        this.profileReviewDataList = profileReviewDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderProfileReview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate( R.layout.reviews_profile_rv,parent,false);
        return new viewHolderProfileReview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderProfileReview holder, final int position) {
        final ProfileReviewData profileReviewData = profileReviewDataList.get(position);
        holder.name.setText(profileReviewData.getProfileName());
        Picasso.get().load(profileReviewData.getImgUrl()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  profileReviewDataList.size();
    }

    public class viewHolderProfileReview extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        public viewHolderProfileReview(@NonNull View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageViewReviewProfile );
            name = itemView.findViewById( R.id.textViewNameProfileReview );
        }
    }
}

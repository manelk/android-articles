package com.example.articlesproject.ui.home;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.articlesproject.R;
import com.example.articlesproject.model.Popular;
import com.google.android.material.chip.Chip;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    List<Popular> data;

    public PopularAdapter(List<Popular> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.article_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Popular pp = data.get(position);

        holder.profileImage.setImageResource(pp.getProfileImage());
        holder.coverImage.setImageResource(pp.getCoverImage());
        holder.title.setText(pp.getTitle());
        holder.name.setText(pp.getName());
        holder.createdAt.setText(pp.getCreatedAt());
        holder.category.setText(pp.getCategory());
        holder.stars.setText(pp.getStars());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView coverImage, profileImage;
        public TextView name, title, createdAt, category, stars;
        public ViewHolder(@NonNull View item) {
            super(item);
            stars = item.findViewById(R.id.post_likes);
            category = item.findViewById(R.id.post_type);
            createdAt = item.findViewById(R.id.post_date);
            title = item.findViewById(R.id.post_title);
            name = item.findViewById(R.id.user_name);
            coverImage = item.findViewById(R.id.coverImage);
            profileImage = item.findViewById(R.id.user_image);
        }
    }
}





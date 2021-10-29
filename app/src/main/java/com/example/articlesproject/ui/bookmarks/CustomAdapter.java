package com.example.articlesproject.ui.bookmarks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.articlesproject.R;
import com.example.articlesproject.model.Bookmark;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{


    private List<Bookmark> bookmarks = new ArrayList<>();



    public CustomAdapter(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bookmark_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Bookmark bookmark = bookmarks.get(position);
        holder.title.setText(bookmark.getTitle());
        holder.author.setText(bookmark.getAuthor());
        holder.image.setImageResource(bookmark.getImage());
    }

    @Override
    public int getItemCount() {
        return bookmarks.size();
    }
    


    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView author, title;
        private final ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.ba_author_name);
            title = itemView.findViewById(R.id.ba_title);
            image = itemView.findViewById(R.id.ba_image);
        }
    }
}






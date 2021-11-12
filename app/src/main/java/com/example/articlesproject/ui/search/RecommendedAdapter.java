package com.example.articlesproject.ui.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.articlesproject.R;
import com.example.articlesproject.model.Recomended;
import com.example.articlesproject.ui.bookmarks.CustomAdapter;

import java.util.List;

public class RecommendedAdapter extends  RecyclerView.Adapter<RecommendedAdapter.ViewHolder> {

    List<Recomended> data;

    public RecommendedAdapter(List<Recomended> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recommended_blogs, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final Recomended recomended = data.get(position);
        holder.rec_title.setText(recomended.getRec_title());
        holder.rec_user_name.setText(recomended.getUser_name());
        holder.rec_user_image.setImageResource(recomended.getUser_image());
        holder.rec_cover.setImageResource(recomended.getRec_image());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
// Lena nhoto lviews yyes eli defined previously ?   YES
    private ImageView rec_user_image, rec_cover;
    private TextView rec_user_name, rec_title;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        rec_user_image = itemView.findViewById(R.id.rec_user_image);
        rec_cover = itemView.findViewById(R.id.rec_cover);
        rec_user_name = itemView.findViewById(R.id.rec_user_name);
        rec_title = itemView.findViewById(R.id.rec_title);

    }
}

}

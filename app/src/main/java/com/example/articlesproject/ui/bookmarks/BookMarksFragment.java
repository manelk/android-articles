package com.example.articlesproject.ui.bookmarks;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.articlesproject.R;
import com.example.articlesproject.model.Article;

import java.util.ArrayList;
import java.util.List;

public class BookMarksFragment extends Fragment {

    private BookMarksViewModel mViewModel;
    private  RecyclerView recyclerView;
    public static BookMarksFragment newInstance() {
        return new BookMarksFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.book_marks_fragment, container, false);
        recyclerView = (RecyclerView) root.findViewById(R.id.bookmarks_recycler);

//       Recyclerview divider
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);



        List<Article> data = new ArrayList<>();
        data.add(new Article("Why the Last Week of the Year is Crucial to Our Success", "Rachella Angel", "14h", "Time Management", "50", R.drawable.alison_cover_image, R.drawable.profile00, "TESTTTT", R.drawable.rachella_body_image));
        data.add(new Article("How to Read More as a Working Parent", "Alison McBain", "1h", "Reading", "20", R.drawable.alison_cover_image, R.drawable.profile01, "TESTTTT", R.drawable.alison_body_image));
        data.add(new Article("Product Manager vs. Project Manager", "Julius Uy", "24h", "Product Management", "30", R.drawable.julius_body_image, R.drawable.profile04, "TESTTTT", R.drawable.julius_body_image));


        CustomAdapter adapter = new CustomAdapter(data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BookMarksViewModel.class);
        // TODO: Use the ViewModel
    }

}
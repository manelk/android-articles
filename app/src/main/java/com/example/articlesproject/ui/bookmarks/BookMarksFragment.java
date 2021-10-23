package com.example.articlesproject.ui.bookmarks;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.articlesproject.R;
import com.example.articlesproject.model.Bookmark;

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

        Bookmark bookmark = new Bookmark("10 Web Application Ideas for Businesses", "DevWerkz", R.drawable.old_women_dog);
        Bookmark bookmark1 = new Bookmark("10 Web Application  for Businesses", "DevWerkz", R.drawable.old_women_dog);
        Bookmark bookmark2 = new Bookmark("10 Web  Ideas for Businesses", "DevWerkz", R.drawable.old_women_dog);


        List<Bookmark> bookmarksData = new ArrayList<>();
        bookmarksData.add(bookmark);
        bookmarksData.add(bookmark1);
        bookmarksData.add(bookmark2);
        bookmarksData.add(bookmark);
        bookmarksData.add(bookmark1);
        bookmarksData.add(bookmark2);

        CustomAdapter adapter = new CustomAdapter(bookmarksData);
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
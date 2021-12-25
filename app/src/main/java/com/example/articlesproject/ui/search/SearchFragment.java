package com.example.articlesproject.ui.search;

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
import com.example.articlesproject.model.Article;
import com.example.articlesproject.ui.home.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private SearchViewModel mViewModel;
    private RecyclerView categoryRecycler, recommendedRecycler;

    public static SearchFragment newInstance() {
        return new SearchFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.search_fragment, container, false);

        //        categories
        categoryRecycler = root.findViewById(R.id.search_category_recycler);

        List<String> categories = new ArrayList<>();
        categories.add("Tech");
        categories.add("Sport");
        categories.add("Entertainment");
        categories.add("News");
        categories.add("Business");
        categories.add("Productivity");


        CategoryAdapter categoryAdapter = new CategoryAdapter(categories);

        categoryRecycler.setHasFixedSize(true);
        categoryRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        categoryRecycler.setAdapter(categoryAdapter);

    //Recommended
        recommendedRecycler = root.findViewById(R.id.recomended_recycler_view);

        List<Article> data = new ArrayList<>();
        data.add(new Article("Why the Last Week of the Year is Crucial to Our Success", "Rachella Angel", "14h", "Time Management", "50", R.drawable.alison_cover_image, R.drawable.profile00, "TESTTTT", R.drawable.rachella_body_image));
        data.add(new Article("How to Read More as a Working Parent", "Alison McBain", "1h", "Reading", "20", R.drawable.alison_cover_image, R.drawable.profile01, "TESTTTT", R.drawable.alison_body_image));
        data.add(new Article("Product Manager vs. Project Manager vs. Technical Program Manager", "Julius Uy", "24h", "Product Management", "30", R.drawable.julius_body_image, R.drawable.profile04, "TESTTTT", R.drawable.julius_body_image));


        RecommendedAdapter recommendedAdapter = new RecommendedAdapter(data);

        recommendedRecycler.setHasFixedSize(true);
        recommendedRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recommendedRecycler.setAdapter(recommendedAdapter);



        return  root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SearchViewModel.class);
        // TODO: Use the ViewModel
    }

}
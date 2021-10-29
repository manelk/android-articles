package com.example.articlesproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.articlesproject.model.Popular;
import com.example.articlesproject.ui.details.DetailsActivity;
import com.example.articlesproject.R;
import com.example.articlesproject.databinding.HomeFragmentBinding;
import com.example.articlesproject.ui.user.UserActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private HomeFragmentBinding binding;

    private RecyclerView categoryRecycler, popular_recycler_view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = HomeFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        categories
        categoryRecycler = root.findViewById(R.id.category_recycler);

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


//        popular
        popular_recycler_view = root.findViewById(R.id.popular_recycler_view);

        List<Popular> popular_data = new ArrayList<>();
        popular_data.add(new Popular("title1", "name1", "14h", "Sports", "255", R.drawable.dogs, R.drawable.profile00));
        popular_data.add(new Popular("title2", "name2", "1h", "Productivity", "20", R.drawable.dogs, R.drawable.profile01));
        popular_data.add(new Popular("title3", "name3", "24h", "Tech", "30", R.drawable.dogs, R.drawable.profile04));

        PopularAdapter popularAdapter = new PopularAdapter(popular_data);

        popular_recycler_view.setHasFixedSize(true);
        popular_recycler_view.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        popular_recycler_view.setAdapter(popularAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
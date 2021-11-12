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
import com.example.articlesproject.model.Recomended;
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
        List<Recomended> data = new ArrayList<>();

//        Nahna nesta3mloo style ki tabda 3ana nafs les prorprietes yet3awdoo
        // mesh besh zeda n centraliziw les styles wahdhom? genre menghir f west XML -- outside ?
//        mantsawerch aala khater bech twali barcha
        // oki mela taw nekhdmou kein ali yetawdou? kima cards, recommended hajet akeika ?
//        kima receycler view
//        aando width: much parent fi lkol
//        fhemtha
//        ok hani bech nekhdemha

        data.add(new Recomended(R.drawable.profile04, R.drawable.dogs, "Med", "HELLO WORLD!"));
        data.add(new Recomended(R.drawable.profile04, R.drawable.dogs, "Dan", "Its a title!"));
        data.add(new Recomended(R.drawable.profile02, R.drawable.dogs, "Nix", "Its a title2!"));
        data.add(new Recomended(R.drawable.profile00, R.drawable.dogs, "DOe", "Its a title2096!"));

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
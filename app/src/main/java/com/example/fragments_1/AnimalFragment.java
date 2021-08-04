package com.example.fragments_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {

private RecyclerView recyclerView;
private ArrayList<Model_Animal> dataList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void setRecyclerView() {
        AdapterAnimal adapterAnimal = new AdapterAnimal(dataList);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterAnimal);
    }

    private void buildList() {
        for(int i = 0;i<100;i++){
            Model_Animal model_animal = new Model_Animal("Tom",R.drawable.dog);
            dataList.add(model_animal);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }
}
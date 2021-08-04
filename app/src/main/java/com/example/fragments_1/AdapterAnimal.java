package com.example.fragments_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAnimal extends RecyclerView.Adapter<viewHolderAnimal> {

    private ArrayList<Model_Animal> dataList = new ArrayList<>();

    public AdapterAnimal(ArrayList<Model_Animal> dataList){
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public viewHolderAnimal onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new viewHolderAnimal(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderAnimal holder, int position) {
        Model_Animal model_animal = dataList.get(position);
        holder.setData(model_animal);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

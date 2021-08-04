package com.example.fragments_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolderAnimal extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private ImageView img_animal;
    public viewHolderAnimal(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvName = itemView.findViewById(R.id.name);
        img_animal = itemView.findViewById(R.id.img_animal);
    }

    public void setData(Model_Animal animal){
        mTvName.setText(animal.getName());
        img_animal.setImageResource(animal.getId());
    }
}

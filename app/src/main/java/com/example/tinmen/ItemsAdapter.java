package com.example.tinmen;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsViewHolder> {
    List<ItemsObject> data;

    public ItemsAdapter(List<ItemsObject> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_raw_layout,viewGroup,false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder itemsViewHolder, int i) {
        ItemsObject itemsObject=data.get(i);
        itemsViewHolder.bind(itemsObject);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

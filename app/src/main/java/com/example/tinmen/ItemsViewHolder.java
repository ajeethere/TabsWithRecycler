package com.example.tinmen;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsViewHolder extends RecyclerView.ViewHolder {
    View view;
    public ItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        view=itemView;
    }

    public void bind(ItemsObject itemsObject) {
        ImageView imageView=(ImageView)view.findViewById(R.id.item_img);
        imageView.setImageResource(itemsObject.getItemImg());
        TextView name=(TextView)view.findViewById(R.id.item_name);
        name.setText(itemsObject.getItemName());
        TextView price=(TextView)view.findViewById(R.id.item_price);
        price.setText(itemsObject.getItemPrice());
    }

}

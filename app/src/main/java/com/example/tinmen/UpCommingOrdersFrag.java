package com.example.tinmen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpCommingOrdersFrag extends Fragment {


    public UpCommingOrdersFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_up_comming_orders, container, false);

        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.upcoming_list_view);

        List<ItemsObject> list=new ArrayList<>();
        list.add(new ItemsObject("Biryani","200 /-",R.mipmap.biryani));
        list.add(new ItemsObject("Fried Rice","200 /-",R.mipmap.friedrice));
        list.add(new ItemsObject("Sandwich","200 /-",R.mipmap.sandwich));
        list.add(new ItemsObject("Burger","200 /-",R.mipmap.burger));
        list.add(new ItemsObject("Biryani","200 /-",R.mipmap.biryani));
        list.add(new ItemsObject("Fried Rice","200 /-",R.mipmap.friedrice));
        list.add(new ItemsObject("Sandwich","200 /-",R.mipmap.sandwich));
        list.add(new ItemsObject("Burger","200 /-",R.mipmap.burger));
        list.add(new ItemsObject("Biryani","200 /-",R.mipmap.biryani));
        list.add(new ItemsObject("Fried Rice","200 /-",R.mipmap.friedrice));
        list.add(new ItemsObject("Sandwich","200 /-",R.mipmap.sandwich));
        list.add(new ItemsObject("Burger","200 /-",R.mipmap.burger));
        list.add(new ItemsObject("Biryani","200 /-",R.mipmap.biryani));
        list.add(new ItemsObject("Fried Rice","200 /-",R.mipmap.friedrice));
        list.add(new ItemsObject("Sandwich","200 /-",R.mipmap.sandwich));
        list.add(new ItemsObject("Burger","200 /-",R.mipmap.burger));
        recyclerView.setAdapter(new ItemsAdapter(list));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

}

package com.example.ecommerace.fragement;

import android.content.Context;
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

import com.example.ecommerace.R;

import java.util.ArrayList;
public class HomeFragment extends Fragment {
    RecyclerView re_tag, re_product;
    ArrayList<String> tag;
    ArrayList<productdata> product;
    tag_adapter adapter;
    product_adapter product_adapter;
    Context context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        re_tag = v.findViewById(R.id.tag_re);
        re_product = v.findViewById(R.id.product_re);
        re_tag.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        tag = new ArrayList<>();
        tag.add("All");
        tag.add("New");
        tag.add("Sofa");
        tag.add("Table");
        tag.add("Chair");
        adapter = new tag_adapter(tag);
        re_tag.setAdapter(adapter);
        product = new ArrayList<>();
        product.add(new productdata(R.drawable.chair,"Best Chair","Brown chair for girls","RS1500","4.0"));
        product.add(new productdata(R.drawable.chair_2,"Pakistan Chair","Made in pakistan  chair for girls","RS2500","4.5"));
        product.add(new productdata(R.drawable.chair_3,"China Chair","Made in China chair for girls","RS3500","3.0"));
        product.add(new productdata(R.drawable.desk,"Best Desk","Brown Desk for girls","RS4500","4.5"));
        product.add(new productdata(R.drawable.desk_2,"China Desk","Made in pakistan chair for girls","RS5500","4.0"));product.add(new productdata(R.drawable.chair,"Best Chair","Brown chair for girls","RS1500","4.0"));
        product.add(new productdata(R.drawable.chair_2,"Pakistan Chair","Made in pakistan  chair for girls","RS2500","4.5"));
        product.add(new productdata(R.drawable.chair_3,"China Chair","Made in China chair for girls","RS3500","3.0"));
        product.add(new productdata(R.drawable.desk,"Best Desk","Brown Desk for girls","RS4500","4.5"));
        product.add(new productdata(R.drawable.desk_2,"China Desk","Made in pakistan chair for girls","RS5500","4.0"));product.add(new productdata(R.drawable.chair,"Best Chair","Brown chair for girls","RS1500","4.0"));
        product.add(new productdata(R.drawable.chair_2,"Pakistan Chair","Made in pakistan  chair for girls","RS2500","4.5"));
        product.add(new productdata(R.drawable.chair_3,"China Chair","Made in China chair for girls","RS3500","3.0"));
        product.add(new productdata(R.drawable.desk,"Best Desk","Brown Desk for girls","RS4500","4.5"));
        product.add(new productdata(R.drawable.desk_2,"China Desk","Made in pakistan chair for girls","RS5500","4.0"));product.add(new productdata(R.drawable.chair,"Best Chair","Brown chair for girls","RS1500","4.0"));
        product.add(new productdata(R.drawable.chair_2,"Pakistan Chair","Made in pakistan  chair for girls","RS2500","4.5"));
        product.add(new productdata(R.drawable.chair_3,"China Chair","Made in China chair for girls","RS3500","3.0"));
        product.add(new productdata(R.drawable.desk,"Best Desk","Brown Desk for girls","RS4500","4.5"));
        product.add(new productdata(R.drawable.desk_2,"China Desk","Made in pakistan chair for girls","RS5500","4.0"));
        product_adapter = new product_adapter(context,product);
        re_product.setLayoutManager(new GridLayoutManager(context,2));
        re_product.setAdapter(product_adapter);


        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}

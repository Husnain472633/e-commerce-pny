package com.example.ecommerace.fragement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerace.R;

import java.util.ArrayList;

public class tag_adapter extends RecyclerView.Adapter<tag_adapter.ViewHolder> {

    private ArrayList<String> tag;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);


            textView = (TextView) view.findViewById(R.id.tex_tag);
        }

        public TextView getTextView() {
            return textView;
        }
    }


    public tag_adapter(ArrayList<String> tag) {
        this.tag = tag;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(tag.get(position));



    }


    @Override
    public int getItemCount() {
        return tag.size();
    }
}

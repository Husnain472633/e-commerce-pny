package com.example.ecommerace.fragement;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerace.R;
import com.example.ecommerace.productdetail;

import java.util.ArrayList;

public class product_adapter extends RecyclerView.Adapter<product_adapter.ViewHolder> {

    private ArrayList<productdata> product;
    private Context context;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView text_name, text_des , text_price , text_rating;
        private final ImageView proimage;
        private  final CardView cartproduct;

        public ViewHolder(View view) {
            super(view);


            text_name = (TextView) view.findViewById(R.id.pr_name);
            text_des = (TextView) view.findViewById(R.id.txt_product_des);
            text_price = (TextView) view.findViewById(R.id.txt_product_price);
            text_rating = (TextView) view.findViewById(R.id.txt_product_rating);
            proimage = (ImageView) view.findViewById(R.id.im_product_image);
            cartproduct = (CardView) view.findViewById(R.id.cart_product);


        }

        public TextView getText_name() {
            return text_name;
        }

        public TextView getText_des() {
            return text_des;
        }

        public TextView getText_price() {
            return text_price;
        }

        public TextView getText_rating() {
            return text_rating;
        }

        public ImageView getProimage() {
            return proimage;
        }

        public CardView getCartproduct() {
            return cartproduct;
        }
    }


    public product_adapter(Context context, ArrayList<productdata> product) {
        this.product = product;
        this.context = context;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_product, viewGroup, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getText_name().setText(product.get(position).getName());
        viewHolder.getText_des().setText(product.get(position).getDes());
        viewHolder.getText_price().setText(product.get(position).getPrice());
        viewHolder.getText_rating().setText(product.get(position).getReting());

        viewHolder.getProimage().setImageDrawable(ContextCompat.getDrawable(context , product.get(position).getImage()));

        viewHolder.getCartproduct().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, productdetail.class);
                intent.putExtra("product",product.get(position));
                context.startActivity(intent);
            }
        });



    }


    @Override
    public int getItemCount() {
        return product.size();
    }
}

package com.example.ecommerace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerace.fragement.productdata;

public class productdetail extends AppCompatActivity {
    productdata product;
    ImageView pro_image;
    TextView pro_name_de, pro_dea_de, pro_price_de, pro_rating_de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetail);
        product = (productdata) getIntent().getSerializableExtra("product");
        pro_name_de = findViewById(R.id.pro_name);
        pro_dea_de = findViewById(R.id.pro_des);
        pro_price_de = findViewById(R.id.pro_price);
        pro_rating_de = findViewById(R.id.pro_rat);
        pro_image = findViewById(R.id.pro_image);

        pro_image.setImageDrawable(ContextCompat.getDrawable(this,product.getImage()));
        pro_name_de.setText(product.getName());
        pro_dea_de.setText(product.getDes());
        pro_price_de.setText(product.getPrice());
        pro_rating_de.setText(product.getReting());

    }
}

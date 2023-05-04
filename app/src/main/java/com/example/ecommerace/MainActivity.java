package com.example.ecommerace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.ecommerace.fragement.CartFragment;
import com.example.ecommerace.fragement.FavorFragment;
import com.example.ecommerace.fragement.HomeFragment;
import com.example.ecommerace.fragement.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.botton_view);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_bott:
                        HomeFragment homeFragment = new HomeFragment();
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.frame,homeFragment).commit();
                        return true;
                    case R.id.favorate_bott:
                        FavorFragment favorFragment = new FavorFragment();
                        FragmentManager f = getSupportFragmentManager();
                        f.beginTransaction().replace(R.id.frame,favorFragment).commit();
                        return true;
                    case R.id.cart_bott:
                        CartFragment cartFragment = new CartFragment();
                        FragmentManager c = getSupportFragmentManager();
                        c.beginTransaction().replace(R.id.frame,cartFragment).commit();
                        return true;

                    case R.id.profile_bott:

                        ProfileFragment profileFragment = new ProfileFragment();
                        FragmentManager p = getSupportFragmentManager();
                        p.beginTransaction().replace(R.id.frame,profileFragment).commit();
                        return true;


                }
                return false;

            }

        });
        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frame,homeFragment).commit();




    }
}
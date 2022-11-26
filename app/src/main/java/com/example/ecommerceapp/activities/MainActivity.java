package com.example.ecommerceapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    Fragment homefragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        homefragment = new HomeFragment();
        loadFlagment(homefragment);
    }

    private void loadFlagment(Fragment homefragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.homecontainer,homefragment);
        transaction.commit();

    }
}
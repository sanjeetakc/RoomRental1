package com.example.roomrental.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.roomrental.fragment.AddFragment;
import com.example.roomrental.fragment.HomeFragment;
import com.example.roomrental.fragment.MoreFragment;
import com.example.roomrental.fragment.NotificationFragment;
import com.example.roomrental.R;
import com.example.roomrental.search.SearchFragment;
import com.example.roomrental.Profile.Userprofile;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private ImageButton mimageButton;
    //ImageButton imageButton;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        } else {

        }

        BottomNavigationView bottomNav = findViewById(R.id.nav_view);
        ImageButton imageButton = findViewById(R.id.user_detail);
        bottomNav.setOnNavigationItemSelectedListener(navListner);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, Userprofile.class));
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_search_button:
                            selectedFragment = new SearchFragment();
                            break;
                        case R.id.nav_add:
                            selectedFragment = new AddFragment();
                            break;
                        case R.id.nav_notification_background:
                            selectedFragment = new NotificationFragment();
                            break;
                        case R.id.nav_setting:
                            selectedFragment = new MoreFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };
    //public void onBackPressed() {
      //  moveTaskToBack(true);
    //}

}

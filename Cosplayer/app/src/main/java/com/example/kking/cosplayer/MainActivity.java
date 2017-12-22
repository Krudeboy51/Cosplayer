package com.example.kking.cosplayer;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FragmentManager fm;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction().replace(R.id.content, new SettingsFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    fm.beginTransaction().replace(R.id.content, new CosplayListFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    fm.beginTransaction().replace(R.id.content, new AddPlayerFragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content, new CosplayListFragment()).commit();
        navigation.setSelectedItemId(R.id.navigation_dashboard);
    }



}

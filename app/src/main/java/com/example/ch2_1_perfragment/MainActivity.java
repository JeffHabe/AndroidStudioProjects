package com.example.ch2_1_perfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private HomeFragment hF;
    private myPreferenceFragment mPf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hF=new HomeFragment();
        mPf =new myPreferenceFragment();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.myContent,hF,"");
        ft.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.per_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FragmentTransaction ft =getSupportFragmentManager().
                beginTransaction();
        switch (item.getItemId()) {
            case R.id.open_per_edit:
                ft.replace(R.id.myContent,mPf).addToBackStack("");
                ft.commit();
            break;
        }

        return super.onOptionsItemSelected(item);
    }
}
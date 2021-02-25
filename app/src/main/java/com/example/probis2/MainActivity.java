package com.example.probis2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView btmView = findViewById(R.id.btm_nav);
        btmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment f;
                if(item.getItemId()==R.id.excercise){
                    f=Home_ExcerciseFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,f).commit();
                    return true;
                }
                else if(item.getItemId()==R.id.question){
                    f=QuestionFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,f).commit();
                    return true;
                }
                return false;
            }
        });
        if(savedInstanceState==null){
            btmView.setSelectedItemId(R.id.excercise);
        }

    }
}
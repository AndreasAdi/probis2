package com.example.probis2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home_ExcerciseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home_ExcerciseFragment extends Fragment {


    public Home_ExcerciseFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Home_ExcerciseFragment newInstance() {
        Home_ExcerciseFragment fragment = new Home_ExcerciseFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home__excercise, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView img= view.findViewById(R.id.imageView2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i= new Intent(getActivity(),exercise_Activity.class);
                startActivity(i);
            }
        });
    }

    public void click(View v){

    }
}
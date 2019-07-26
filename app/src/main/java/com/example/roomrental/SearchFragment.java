package com.example.roomrental;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

public class SearchFragment extends Fragment {
    private SearchView msearchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);

        //msearchView= findViewId(R.id.search_view);
    }
    /*@Override
    public void onDestroy() {
        super.onDestroy();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();}*/


    public void onCreate() {
        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        } catch (Exception e) {
            Log.i("Erooor", e.getMessage());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        } catch (Exception e) {
            Log.i("Erooor", "Cannot show");
        }
    }
}

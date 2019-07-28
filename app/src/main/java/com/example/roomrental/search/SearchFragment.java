package com.example.roomrental.search;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.roomrental.R;
import com.example.roomrental.activities.HomeActivity;

public class SearchFragment extends Fragment {
    private SearchView msearchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
        //msearchView= findViewId(R.id.search_view);
    }
    /*@Override
    public void onDestroy() {
        super.onDestroy();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();}*/


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        try {
            ((HomeActivity) getActivity()).getSupportActionBar().hide();
        } catch (Exception e) {
            Log.i("Erooor", "Cannot hide");
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        try {
            ((HomeActivity) getActivity()).getSupportActionBar().show();
        } catch (Exception e) {
            Log.i("Erooor", "Cannot show");
        }
    }
}

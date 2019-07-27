package com.example.roomrental;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NotificationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
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



package com.example.roomrental.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.roomrental.R;
import com.example.roomrental.activities.HomeActivity;
import com.example.roomrental.model.Data;
import com.example.roomrental.model.Domain;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private SearchView msearchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        /**
         * Demo Search operation
         * Change as you like
         *
         * Don't know why but its not working, maybe searchView is underConstruction !!
         */
        msearchView = view.findViewById(R.id.search_view);
//        msearchView.setIconified(false);
        final Domain domain = new Domain();
        final TextView text = view.findViewById(R.id.textView3);
        msearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                text.setText("");

                String locationSearchText = msearchView.getQuery().toString();

                ArrayList<Data> roomDatas = domain.locationToRoomData.get(locationSearchText.toLowerCase());
                Log.i("Data_Information", "Is RoomData null? "+((roomDatas == null)?"Yes":"No"));

                if (roomDatas != null) {
                    for (Data data : roomDatas) {
                        if(data!=null) {
                            //use the data anywhere you want

                            Log.i("Data_Information", data.toString());

//                    int room_image = data.getRoom_image();
//                    int profile = data.getProfile();
//                    String ownerName = data.getOwnerName();
//                    String location = data.getLocation();
//                    double price = data.getPrice();
                        } else {
                            Log.i("Data_Information", "No room at "+locationSearchText);
                        }
                    }
                } else {
                    Log.i("Data_Information", "No search results");
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        return view;
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

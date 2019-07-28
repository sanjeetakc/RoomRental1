package com.example.roomrental.model;

import com.example.roomrental.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Domain {

    /**
     * locationToRoomData maps Location with the list of rooms in that location
     * <p>
     * String, ArrayList<Data>
     * <p>
     * Suitable for search implementation only
     */
    public HashMap<String, ArrayList<Data>> locationToRoomData = new HashMap<String, ArrayList<Data>>() {{
        //put more location with the list of rooms in the location here in the same pattern

        put("Bhaktapur".toLowerCase(), new ArrayList<Data>() {{
            //add more Data of bhaktapur here
            add(new Data("Sanjeeta Khatri", R.drawable.home_room_img1, "Bhaktapur", R.drawable.home_room_img2, 1500));
        }});

        put("Kathmandu".toLowerCase(), new ArrayList<Data>() {{
            //add more Data of Kathmandu here
            add(new Data("Suranjan Poudel", R.drawable.home_room_img1, "Kathmandu", R.drawable.home_room_img2, 11500));
        }});
    }};


    public static String[] ownername = new String[]{
            "Sanjeeta khatri",
            "Alisha",
            "Muna",
            "Rukshana"
    };
    public static int[] room_image = new int[]{
            R.drawable.home_room_img2,
            R.drawable.home_room_img1,
            R.drawable.home_room_img2,
            R.drawable.black_x
    };
    public static String[] location = new String[]{
            "Bhaktapur",
            "bharatpur",
            "Lalitpur",
            "Baneswor"
    };
    public static int[] profile = new int[]{
            R.drawable.home_room_img2,
            R.drawable.home_room_img2,
            R.drawable.home_room_img2,
            R.drawable.home_room_img2

    };
    public static double[] price = new double[]{
            1500,
            2000,
            2500,
            4000
    };

}

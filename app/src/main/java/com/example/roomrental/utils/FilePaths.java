package com.example.roomrental.utils;

import android.os.Environment;

public interface FilePaths {
    //*storage/emulated/0**
    String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();
    String CAMERA = ROOT_DIR + "DCIM/camera";
    String PICTURE = ROOT_DIR + "/Pictures";
}

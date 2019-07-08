package com.bignerdranch.android.myapplication.util;

/**
 * Created by ASUS on 2019/7/8.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

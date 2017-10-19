package com.fastweather.app.fastweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yuxiang on 2017/10/18.
 */

public class HttpUtils {

    public static void sendOkHttpRequest(String url, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
}

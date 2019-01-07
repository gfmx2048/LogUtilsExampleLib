package com.company.logutil;

import android.util.Log;

/**
 * Created by Vasilis Viktoratos on 7/1/2019.
 */
public class LogDebug {

    private static final String TAG = LogDebug.class.getSimpleName();

    public static void d(String message) {
        Log.d(TAG, message);
    }

}

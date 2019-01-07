package com.company.errorutil;

import android.util.Log;

/**
 * Created by Vasilis Viktoratos on 7/1/2019.
 */
public class ErrorD {
    private static final String TAG = ErrorD.class.getSimpleName();

    public static void d(String message) {
        Log.e(TAG, message);
    }
}

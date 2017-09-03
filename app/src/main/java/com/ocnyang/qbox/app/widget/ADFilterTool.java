package com.ocnyang.qbox.app.widget;

import android.content.Context;
import android.content.res.Resources;

import com.ocnyang.qbox.app.R;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/2/21 09:35.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public class ADFilterTool {
    public static boolean hasAd(Context context, String url) {
        Resources res = context.getResources();
        String[] adUrls = res.getStringArray(R.array.adBlockUrl);
        for (String adUrl : adUrls) {
            if (url.contains(adUrl)) {
                return true;
            }
        }
        return false;
    }

}

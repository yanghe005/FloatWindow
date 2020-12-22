package com.yhao.floatwindow;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;


/**
 * Created by yhao on 2017/12/22.
 * https://github.com/yhaolpz
 */

class Util {


    static View inflate(Context applicationContext, int layoutId) {
        LayoutInflater inflate = (LayoutInflater) applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflate.inflate(layoutId, null);
    }

    static int getDisplayWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    static int getDisplayHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    static boolean isViewVisible(View view) {
        return view.getGlobalVisibleRect(new Rect());
    }

    public static int navBarHeight(Context context) {
        int navigationHeight = 0;
        int resourceId = context.getResources()
                .getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            navigationHeight = context.getResources().getDimensionPixelSize(resourceId);
        }
        return navigationHeight;
    }
}

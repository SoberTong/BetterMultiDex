package com.boltfish.multidex;

import android.app.Application;
import android.content.Context;
import android.support.multidex.BetterMultiDex;

/**
 * Created by yutou on 2016/8/24.
 */
public class App extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        BetterMultiDex.install(this);
    }
}

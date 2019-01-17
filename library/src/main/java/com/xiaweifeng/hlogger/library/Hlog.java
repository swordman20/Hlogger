package com.xiaweifeng.hlogger.library;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author Hades
 * @create 2019/1/17
 */
public class Hlog {
    public static void d(String log){
        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.d("Hlog："+log);
    }
}

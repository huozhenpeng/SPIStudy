package com.miduo.router.module1;

import android.content.Context;

public interface Module1Service {

    /**
     * 跳转
     */
    void startModule1Activity(Context context);

    /**
     * 请求普通方法
     */
    String getModule1Token();

}

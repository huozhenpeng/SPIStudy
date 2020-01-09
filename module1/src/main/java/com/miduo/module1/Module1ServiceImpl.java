package com.miduo.module1;

import android.content.Context;
import android.content.Intent;

import com.miduo.router.module1.Module1Service;

public class Module1ServiceImpl implements Module1Service {
    @Override
    public void startModule1Activity(Context context) {

        Intent intent=new Intent(context,Module1Activity.class);
        context.startActivity(intent);
    }

    @Override
    public String getModule1Token() {

        Token token=new Token();
        return token.getToken();
    }
}

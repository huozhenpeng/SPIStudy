package com.miduo.componentspistudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.miduo.router.module1.Module1Service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
    }

    public void jump(View view) {
        ServiceLoader<Module1Service> loader=ServiceLoader.load(Module1Service.class);

        Iterator<Module1Service>  iterator=loader.iterator();

        if(iterator.hasNext())
        {
            //在next方法中才利用反射去初始化实际的对象的
            Module1Service service=iterator.next();
//            service.startModule1Activity(this);
            tv.setText(service.getModule1Token());
        }
    }
}

package com.kb.mallpractice.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kb.mallpractice.R;

import java.util.ArrayList;
import java.util.List;

public class LeakMemoryActivity extends AppCompatActivity {
    private static A a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_memory);

        a = new A();
    }

    public void toClose(View view) {
        finish();
    }

    class A{

    }
}


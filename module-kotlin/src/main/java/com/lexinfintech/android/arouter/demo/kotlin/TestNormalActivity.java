package com.lexinfintech.android.arouter.demo.kotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lexinfintech.android.arouter.demo.kotlin.R;
import com.lexinfintech.android.arouter.facade.annotation.Route;

@Route(path = "/kotlin/java")
public class TestNormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_normal);
    }
}

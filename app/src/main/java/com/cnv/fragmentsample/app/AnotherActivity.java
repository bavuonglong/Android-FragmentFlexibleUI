package com.cnv.fragmentsample.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class AnotherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        FragmentB fragmentB = (FragmentB)getFragmentManager().findFragmentById(R.id.fragment2);
        if (fragmentB != null) {
            fragmentB.changeData(index);
        }
    }
}

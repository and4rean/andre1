package com.andre1.app.activity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.andre1.R;
import com.andre1.app.fragment.Fragment1;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public class Activity3RecyclerView extends AppCompatActivity {

    private Unbinder mBind;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recycler_view);
        mBind = ButterKnife.bind(this);
    }

    @Override protected void onStart() {
        super.onStart();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fl_fragment_container, new Fragment1(), Fragment1.TAG)
                .commit();
    }

    @Override protected void onStop() {
        if (mBind != null) {
            mBind.unbind();
            mBind = null;
        }
        super.onStop();
    }

}

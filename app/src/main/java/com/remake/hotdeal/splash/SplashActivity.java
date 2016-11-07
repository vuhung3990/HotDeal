package com.remake.hotdeal.splash;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.remake.hotdeal.R;
import com.remake.hotdeal.utils.ActivityUtils;

public class SplashActivity extends AppCompatActivity {
    @NonNull
    private SplashFragment splashFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);


        if (splashFragment == null) {
            splashFragment = SplashFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    splashFragment, R.id.contentFrame);
        }
        new SplashPresenter(splashFragment);
    }
}

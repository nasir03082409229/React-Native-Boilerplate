package com.seiour;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;

import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends ReactActivity {
    public final int SPLASH_DELAY = 1000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // SplashScreen.show(this, R.style.SplashTheme);
        super.onCreate(savedInstanceState);
        new CountDownTimer(SPLASH_DELAY, SPLASH_DELAY) {
            public void onTick(long millisUntilFinished) {}
            public void onFinish() {
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                getWindow().setStatusBarColor(Color.GRAY);
            };
        }.start();
    };

    @Override
    protected String getMainComponentName() {
        return "recoupi";
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected ReactRootView createRootView() {
                return new RNGestureHandlerEnabledRootView(MainActivity.this);
            }
        };
    }
}

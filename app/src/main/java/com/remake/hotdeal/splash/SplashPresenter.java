package com.remake.hotdeal.splash;

import android.support.annotation.NonNull;

import rx.subscriptions.CompositeSubscription;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by developer on 11/7/16.
 */

public class SplashPresenter implements SplashContract.Presenter {

    @NonNull
    private final SplashContract.View mSplashView;
    @NonNull
    private CompositeSubscription mSubscriptions;

    public SplashPresenter(@NonNull SplashContract.View view) {
        mSplashView = checkNotNull(view);
        mSplashView.setPresenter(this);
    }

    @Override
    public void subscribe() {
        isFirstTime();
    }

    @Override
    public void unsubscribe() {
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public boolean isFirstTime() {
        //TODO: shrare preference check
        return false;
    }

    @Override
    public void disablePhysicBack() {
        // TODO: 11/7/16  
    }
}

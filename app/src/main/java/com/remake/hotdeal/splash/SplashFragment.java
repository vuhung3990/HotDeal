package com.remake.hotdeal.splash;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.remake.hotdeal.R;

import static com.google.common.base.Preconditions.checkNotNull;
/**
 * Created by developer on 11/7/16.
 */

public class SplashFragment extends Fragment implements SplashContract.View {
    @NonNull
    private SplashContract.Presenter mPresenter;

    @Override
    public void setPresenter(SplashContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    public static SplashFragment newInstance() {
        return new SplashFragment();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unsubscribe();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.splash_fragment, container, false);
        return root;
    }
}

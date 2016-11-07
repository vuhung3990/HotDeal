package com.remake.hotdeal.splash;

import com.remake.hotdeal.BasePresenter;
import com.remake.hotdeal.BaseView;

/**
 * Created by developer on 11/7/16.
 */

public interface SplashContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        /**
         * show help screen if first time
         * @return true: if user just install app and open, otherwise
         */
        boolean isFirstTime();

        /**
         * don't allow back to exit on splash
         *
         */
        void disablePhysicBack();
    }
}

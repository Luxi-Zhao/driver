package com.android.ubclaunchpad.driver.login;

import android.content.Intent;

import com.android.ubclaunchpad.driver.BasePresenter;
import com.android.ubclaunchpad.driver.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 * <p/>
 * Created by Chris Li on 6/1/2016.
 */
public interface LoginContract {

    interface Presenter extends BasePresenter {

        // we can expose activity/fragment lifecycle events to the presenter
        void onStart();

        void onStop();

        void onActivityResult(int requestCode, int resultCode, Intent data);

        void createUserWithEmail(String email, String password, String confirmPassword);

        void signInWithEmail(String email, String password);

        void signInWithGoogle();

        void signInWithFacebook();

        void signOut();
    }

    interface View extends BaseView<Presenter> {

        void showInvalidEmailError();

        void showEmptyFieldError();

        void showProgressDialog();

        void hideProgressDialog();

        void showGoogleAuthView(Intent signInIntent, int requestCode);

        void showMainActivity();
    }
}

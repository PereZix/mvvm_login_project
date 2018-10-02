package com.a2p.mvvm_project.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.a2p.mvvm_project.model.User;
import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by alvaro.perez on 01/10/2018.
 */

public class LoginViewModel extends BaseObservable {
    private User user;

    private String successMessage = "OK";
    private String errorMessage = "ERROR";

    @Bindable
    public String toastMessage = null;

    public String getToastMessage(){
        return toastMessage;
    }

    private void setToastMessage(String toastMessage){
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public LoginViewModel() {
        this.user = new User("","");
    }

    public void afterEmailTextChanged(CharSequence sequence){
        user.setEmail(sequence.toString());
    }

    public void afterPassTextChanged(CharSequence sequence){
        user.setPassword(sequence.toString());
    }

    public void onLoginClicked(){
        if (user.isInputDataValid()){
            setToastMessage(successMessage);
        }else {
            setToastMessage(errorMessage);
        }
    }
}

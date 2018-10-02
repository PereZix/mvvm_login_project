package com.a2p.mvvm_project.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by alvaro.perez on 01/10/2018.
 */

public class User {
    @NonNull
    private String email;
    @NonNull
    private String password;

    public User(@NonNull String email, @NonNull String password) {
        this.email = email;
        this.password = password;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public boolean isInputDataValid(){
        boolean isValid = false;

        if (!TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 5){
            isValid = true;
        }else {
            isValid =false;
        }

        return isValid;
    }
}

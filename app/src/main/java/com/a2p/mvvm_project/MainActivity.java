package com.a2p.mvvm_project;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.a2p.mvvm_project.databinding.ActivityMainBinding;
import com.a2p.mvvm_project.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String toastMessage){
        if (toastMessage != null){
            Toast.makeText(view.getContext(), toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}

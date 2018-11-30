package com.example.amr.hatly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.setApplicationId("222222222222");
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
    }
}

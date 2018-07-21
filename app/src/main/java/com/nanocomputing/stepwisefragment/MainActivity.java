package com.nanocomputing.stepwisefragment;

import android.net.Credentials;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stepstone.stepper.StepperLayout;

public class MainActivity extends AppCompatActivity
        implements Personal_info.OnFragmentInteractionListener,
        credentials.OnFragmentInteractionListener,
complete_registrations.OnFragmentInteractionListener{
    private StepperLayout mStepperLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStepperLayout = (StepperLayout) findViewById(R.id.stepperLayout);
        mStepperLayout.setAdapter(new MyStepperAdapter(getSupportFragmentManager(), this));
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

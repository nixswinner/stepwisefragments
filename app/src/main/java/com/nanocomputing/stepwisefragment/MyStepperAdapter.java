package com.nanocomputing.stepwisefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

/**
 * Created by nix on 7/19/18.
 */

public class MyStepperAdapter extends AbstractFragmentStepAdapter {

    public MyStepperAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        //fragments in positions
        if (position == 0) // if the position is 0 we are returning the First tab
        {
            Personal_info step = new Personal_info();
            Bundle b = new Bundle();
            String CURRENT_STEP_POSITION_KEY="1";
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            step.setArguments(b);
            return step;
        }
       /* else if(position==1)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            credentials credentials = new credentials();
            Bundle b = new Bundle();
            String CURRENT_STEP_POSITION_KEY="1";
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            credentials.setArguments(b);
            return credentials;
        }*/
         else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            complete_registrations complete_reg = new complete_registrations();
            Bundle b = new Bundle();
            String CURRENT_STEP_POSITION_KEY="1";
            b.putInt(CURRENT_STEP_POSITION_KEY, position);
            complete_reg.setArguments(b);
            return complete_reg;
        }
    }



    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        return new StepViewModel.Builder(context)
                .setTitle("1") //can be a CharSequence instead
                .create();
    }
}
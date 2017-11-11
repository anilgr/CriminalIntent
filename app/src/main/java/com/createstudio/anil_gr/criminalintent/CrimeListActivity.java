package com.createstudio.anil_gr.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by anil_gr on 12-01-2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

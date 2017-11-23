package com.example.test.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/11/23.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

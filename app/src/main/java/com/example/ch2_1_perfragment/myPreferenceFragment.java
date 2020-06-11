package com.example.ch2_1_perfragment;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;



public class myPreferenceFragment extends PreferenceFragmentCompat  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pre_set);
    }


}
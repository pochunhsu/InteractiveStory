package com.pchsu.interactivestory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class StoryActivity extends ActionBarActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();

        String name = intent.getStringExtra(getString(R.string.key_name));
        // good practice to add null handler after retrieving data from intent
        if (name==null){
            name = getString(R.string.default_name);
        }
        Log.d(TAG, name);
    }
}

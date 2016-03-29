package com.android.shiz.commander.dzrp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OldMan on 29.03.2016.
 */
public class Connector extends AsyncTask<String, String, String> {
    private RecycleViewAdapter mAdapter;
    private List<Model> modelList = new ArrayList<>();

    @Override
    protected String doInBackground(String... params) {

        // download xml feed
        return "";
    }

    @Override
    protected void onPostExecute(String result) {
        MainActivity.mAdapter.addAllItem(modelList);
    }

}

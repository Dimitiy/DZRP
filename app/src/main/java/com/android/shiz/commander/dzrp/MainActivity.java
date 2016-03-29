package com.android.shiz.commander.dzrp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Model> modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    public static RecycleViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connector con = new Connector();
                con.execute();
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RecycleViewAdapter(modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        animator.setAddDuration(2000);
        animator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(animator);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareModelData();
    }

    private void prepareModelData() {
        mAdapter.clearAllItems();
        Model movie = new Model("122","213", "12", "123");
        modelList.add(movie);

        movie = new Model("122","213", "12", "123");
        modelList.add(movie);

        movie = new Model("122","213", "12", "123");
        modelList.add(movie);

        movie = new Model("122","213", "12112", "123");
        modelList.add(movie);

        movie = new Model("122","213", "12", "1211113");
        modelList.add(movie);

        movie = new Model("122","213", "12", "12311111");
        modelList.add(movie);

        movie = new Model("122","213", "12", "12213343");
        modelList.add(movie);
        Log.d("adapter main", modelList.toString());
        mAdapter.addAllItem(modelList);

    }
    private void prepareModelData(List<Model>  modelList) {
        Log.d("adapter main", modelList.toString());
        mAdapter.addAllItem(modelList);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

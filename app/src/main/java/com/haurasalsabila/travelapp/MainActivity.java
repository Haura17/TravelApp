package com.haurasalsabila.travelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String title = "List Travel";
    private RecyclerView rvTravel;
    private ArrayList<Travel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvTravel = findViewById(R.id.rv_travel);
        rvTravel.setHasFixedSize(true);

        list.addAll(TravelData.getListData());
        showRecyclerTravel();
    }

    private void showRecyclerTravel() {
        rvTravel.setLayoutManager(new LinearLayoutManager(this));
        TravelAdapter travelAdapter = new TravelAdapter(list);
        rvTravel.setAdapter(travelAdapter);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }


    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                about();
                break;
        }

    }

    private void about() {
        Intent intent = new Intent(getApplicationContext(),About.class);
        startActivity(intent);
    }
}

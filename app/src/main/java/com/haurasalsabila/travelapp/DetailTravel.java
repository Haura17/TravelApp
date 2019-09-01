package com.haurasalsabila.travelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailTravel extends AppCompatActivity {

    TextView txtname,txtdescription;
    ImageView imgTravel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_travel);

        imgTravel = findViewById(R.id.detail_item_photo);
        txtname = findViewById(R.id.detail_item_name);
        txtdescription = findViewById(R.id.detail_item_description);


        txtname.setText(getIntent().getStringExtra("name"));
        txtdescription.setText(getIntent().getStringExtra("description"));
        Glide.with(this).load(getIntent().getIntExtra("photo",0)).into(imgTravel);
    }
}

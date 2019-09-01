package com.haurasalsabila.travelapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder>{
    private ArrayList<Travel> listTravel;
    private Context context;
    String[] nameTravel,descriptionTravel,imgTravel;

    public TravelAdapter(ArrayList<Travel> list) {
        this.listTravel = list;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_travel,viewGroup,false);
        return new TravelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, final int position) {

        final Travel travel = listTravel.get(position);
        Glide.with(holder.itemView.getContext()).load(travel.getPhoto()).apply(new RequestOptions().override(350, 550)).into(holder.imgPhoto);

        holder.tvName.setText(travel.getName());
        holder.tvDescription.setText(travel.getDescription());

        holder.cvTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailTravel.class);
                intent.putExtra("name",nameTravel[position]);
                intent.putExtra("description",descriptionTravel[position]);
                intent.putExtra("photo",imgTravel[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTravel.size();
    }

    public class TravelViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        CardView cvTravel;

        public TravelViewHolder(@NonNull View itemView) {
            super(itemView);
            cvTravel = itemView.findViewById(R.id.card_view);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_description);

        }
    }
}

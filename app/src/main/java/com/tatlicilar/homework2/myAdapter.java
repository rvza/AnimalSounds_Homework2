package com.tatlicilar.homework2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Asus on 19.06.2017.
 */
public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    //Neden farklı sınıftan da extend almaya ihtiyac duyuyor?
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView animalName;
        public ImageView animalImage;


        public ViewHolder(View v) {

            super(v);
            animalName = (TextView) v.findViewById(R.id.animalTxt);
            animalImage = (ImageView) v.findViewById(R.id.animalImage);
           // animalImage.setOnClickListener((View.OnClickListener) this);
            }
    }
    List<sounds> sounds;
    CustomItemClickListener listener;
    public  myAdapter(List<sounds> sounds,CustomItemClickListener listener)
    {
        this.listener=listener;
        this.sounds=sounds;
    }
    @Override
    public  myAdapter.ViewHolder onCreateViewHolder(ViewGroup sounds,int viewType)
    {
        View v = LayoutInflater.from(sounds.getContext()).inflate(R.layout.card_view, sounds, false);
        final  ViewHolder view_holder=new ViewHolder(v);
         v.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 listener.onItemClick(view,view_holder.getPosition());
             }
         });
        return  view_holder;
    }
//connection session
   @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        {
        holder.animalName.setText(sounds.get(position).getName());
        holder.animalImage.setImageResource(sounds.get(position).getImages());
        }
    }
    @Override
    public int getItemCount() {
        return sounds.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}

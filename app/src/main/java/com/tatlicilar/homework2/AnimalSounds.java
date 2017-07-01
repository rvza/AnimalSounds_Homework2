package com.tatlicilar.homework2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class AnimalSounds extends AppCompatActivity {
private  RecyclerView recycler_view;
    private List<sounds> sound_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sounds);

        recycler_view=(RecyclerView)findViewById(R.id.recycler_view);
        final MediaPlayer mp0=MediaPlayer.create(this,R.raw.dogsounds);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.catsounds);
        final MediaPlayer mp2=MediaPlayer.create(this,R.raw.giraffesounds);
        final MediaPlayer mp3=MediaPlayer.create(this,R.raw.monkeysounds);
        final MediaPlayer mp4=MediaPlayer.create(this,R.raw.rabbitsounds);
        final MediaPlayer mp5=MediaPlayer.create(this,R.raw.lionsounds);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recycler_view.setLayoutManager(layoutManager);
        sound_list=new ArrayList<sounds>();
        sound_list.add(new sounds("DOG",R.raw.dog));
        sound_list.add(new sounds("CAT",R.raw.cat));
        sound_list.add(new sounds("GIRAFFE",R.raw.giraffe));
        sound_list.add(new sounds("MONKEY",R.raw.monkey));
        sound_list.add(new sounds("RABBIT",R.raw.cat));
        sound_list.add(new sounds("LION",R.raw.lion));

     // animals sounds startinn when Item click
        myAdapter adapter_items=new myAdapter(sound_list, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                sounds soundPosition=sound_list.get(position);

           switch (position)
            {
               case 0:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                   mp0.start();
               break;
               case 1:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                  mp1.start();
                   break;
               case 2:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                   mp2.start();
                   break;
               case 3:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                   mp3.start();
                   break;
               case 4:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                   mp4.start();
                   break;
               case 5:
                   Toast.makeText(getApplicationContext(),"Name:"+" "+soundPosition.getName(),Toast.LENGTH_SHORT).show();
                   mp5.start();
                   break;
           }
            }
        });
        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());

    }
}

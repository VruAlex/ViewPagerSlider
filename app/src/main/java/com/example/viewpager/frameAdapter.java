package com.example.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class frameAdapter extends PagerAdapter {
    private Context context;

    private int[] images = {
            R.drawable.aaa,
            R.drawable.aa,
            R.drawable.a,
            R.drawable.aaaa,
            R.drawable.aaaaa,

    };

    private String[] titleFood = {
            "CASSOULET",
            "BEEF BOUGUIGNOU",
            "SOFFLE",
            "FLMICHE",
            "DUCK CONFIT"
    };
    private String[] descriptionFood = {
            "Words to Describe Taste. The flavor of your food is what most customers focus on when they are deciding what to eat. How you present the dishes on your menu can help build anticipation, and a good menu description could even convince a hesitant customer to try something new. ... Acidic: A food with a sharp taste.",
            "Words to Describe Taste. The flavor of your food is what most customers focus on when they are deciding what to eat. How you present the dishes on your menu can help build anticipation, and a good menu description could even convince a hesitant customer to try something new. ... Acidic: A food with a sharp taste.",
            "Words to Describe Taste. The flavor of your food is what most customers focus on when they are deciding what to eat. How you present the dishes on your menu can help build anticipation, and a good menu description could even convince a hesitant customer to try something new. ... Acidic: A food with a sharp taste.",
            "Words to Describe Taste. The flavor of your food is what most customers focus on when they are deciding what to eat. How you present the dishes on your menu can help build anticipation, and a good menu description could even convince a hesitant customer to try something new. ... Acidic: A food with a sharp taste.",
            "Words to Describe Taste. The flavor of your food is what most customers focus on when they are deciding what to eat. How you present the dishes on your menu can help build anticipation, and a good menu description could even convince a hesitant customer to try something new. ... Acidic: A food with a sharp taste."

    };
    private int[] color = {
            Color.rgb(244, 67, 54),
            Color.rgb(156, 35, 176),
            Color.rgb(33, 150, 243),
            Color.rgb(76, 175, 80),
            Color.rgb(255, 87, 34)
    };


    frameAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount(){
        return titleFood.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        View view = inflater.inflate(R.layout.frame_activity,container, false);
        RelativeLayout slide = view.findViewById(R.id.layout);
        ImageView imageView = view.findViewById(R.id.Image);
        TextView title = view.findViewById(R.id.Title);
        TextView description = view.findViewById(R.id.Description);

        slide.setBackgroundColor(color[position]);
        imageView.setImageResource(images[position]);
        title.setText(titleFood[position]);
        description.setText(descriptionFood[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,@NonNull Object object){
        container.removeView((RelativeLayout) object);
    }

}













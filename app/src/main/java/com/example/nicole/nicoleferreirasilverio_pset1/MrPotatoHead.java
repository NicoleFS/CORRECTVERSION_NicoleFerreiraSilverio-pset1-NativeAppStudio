package com.example.nicole.nicoleferreirasilverio_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatoHead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potato_head);
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.arms:
                ImageView arms = (ImageView)findViewById(R.id.imgarms);
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyes:
                ImageView eyes = (ImageView)findViewById(R.id.imgeyes);
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears:
                ImageView ears = (ImageView)findViewById(R.id.imgears);
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows:
                ImageView eyebrows = (ImageView)findViewById(R.id.imgeyebrows);
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses:
                ImageView glasses = (ImageView)findViewById(R.id.imgglasses);
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.hat:
                ImageView hat = (ImageView)findViewById(R.id.imghat);
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth:
                ImageView mouth = (ImageView)findViewById(R.id.imgmouth);
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.mustache:
                ImageView mustache = (ImageView)findViewById(R.id.imgmustache);
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose:
                ImageView nose = (ImageView)findViewById(R.id.imgnose);
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes:
                ImageView shoes = (ImageView)findViewById(R.id.imgshoes);
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}



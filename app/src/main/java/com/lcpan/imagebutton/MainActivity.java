package com.lcpan.imagebutton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgbtn;
    boolean isPressed = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn = (ImageButton)findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        Bitmap img;
        if(isPressed) {
            img = BitmapFactory.decodeResource(getResources(), R.drawable.bg_android_icon);
            imgbtn.setImageBitmap(img);
        } else {
            img = BitmapFactory.decodeResource(getResources(), R.drawable.bg_sunset_icon);
            imgbtn.setImageBitmap(img);
        }
        isPressed = !isPressed;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.inchararaj.image_changeonbuttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean flag=true;

    public void buttonClicked(View view)
    {
        ImageView image=(ImageView)findViewById(R.id.imageView2);
            if(flag==true) {
                image.setImageResource(R.drawable.dog2);
                flag = false;
            }
            else
            {
                image.setImageResource(R.drawable.dog);
                flag = true;
            }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

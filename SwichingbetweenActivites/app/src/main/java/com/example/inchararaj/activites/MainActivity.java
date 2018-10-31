package com.example.inchararaj.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mainbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainbutton=(Button) findViewById(R.id.button);

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             launchactivity();
            }
        });
    }

public void launchactivity()
{
    Intent intent = new Intent(this, profileActivity.class);
    startActivity(intent);
}
}
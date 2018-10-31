package com.example.inchararaj.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profileActivity extends AppCompatActivity {
    private Button profilebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profilebutton = (Button) findViewById(R.id.button2);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Launchmain();
            }
        });

    }

    public void Launchmain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

package com.example.inchararaj.currenyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view)
    {
        EditText rupee=(EditText)findViewById(R.id.editText);
        double num=Double.parseDouble(rupee.getText().toString());
        num=num/73.90;
        Toast.makeText(MainActivity.this,"Dollar amount : $"+ num ,Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

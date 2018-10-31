package com.example.inchararaj.assignment3_second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] itemname={"Apple","Mango","Strawberry","Blueberry","Banana","Grapes","Orange","Jackfruit"};
    Integer[] image={R.drawable.apple,R.drawable.mango,R.drawable.strawberry,R.drawable.blueberry,R.drawable.banana,R.drawable.grapes,R.drawable.orange,R.drawable.jackfruit };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlistAdapter adapter=new customlistAdapter(this,itemname,image);
        list=(ListView)findViewById(R.id.itemlist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(getApplicationContext(),webviewactivity.class);
                intent.putExtra("itemselected",itemname[position]);
                startActivity(intent);
            }

        });


    }
}

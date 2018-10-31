package com.example.inchararaj.assignment3_second;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class webviewactivity extends AppCompatActivity {
    TextView itemname;
    TextView selected;
    Button b1;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        itemname=(TextView)findViewById(R.id.item1);
        b1=(Button)findViewById(R.id.button);
        selected=(TextView)findViewById(R.id.selected) ;




        Intent intent=getIntent();
        String item=intent.getStringExtra("itemselected");

        if(item.contains("Apple"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Apple");
            selected.setText(" Apple!!!");
        }
        if(item.contains("Mango"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Mango");
            selected.setText(" Mango!!!");
        }
        if(item.contains("Strawberry"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Strawberry");
            selected.setText(" Strawberry!!");
        }
        if(item.contains("Blueberry"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Blueberry");
            selected.setText(" Blueberry!!!");
        }
        if(item.contains("Banana"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Banana");
            selected.setText(" Banana!!!");
        }
        if(item.contains("Grapes"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Grapes");
            selected.setText(" Grapes!!!");
        }
        if(item.contains("Orange"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Orange");
            selected.setText(" Orange!!!");
        }
        if(item.contains("Jackfruit"))
        {
            itemname.setText("https://en.wikipedia.org/wiki/Jackfruit");
            selected.setText(" Jackfruit!!!");
        }

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Uri uri = Uri.parse(itemname.getText().toString());
                                      Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}

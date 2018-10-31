package com.example.inchararaj.testlistview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button addButton;
    ListView listview;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        addButton = (Button) findViewById(R.id.addItem);
        listview = (ListView) findViewById(R.id.listView);
        listItems = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        listview.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(editText.getText().toString().length()>0) {
                    listItems.add(editText.getText().toString());
                    editText.getText().clear();
                    adapter.notifyDataSetChanged();
                }
            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int pos, long id) {
                Toast.makeText(MainActivity.this, "Item" + " " + (pos+1) +" "+ "Clicked", Toast.LENGTH_LONG).show();
                }
        });
    }
}

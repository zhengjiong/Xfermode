package com.zj.example.xfermode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] items = new String[]{
            "PorterDuffXfermode Demo1",
            "PorterDuffXfermode Demo2",
            "PorterDuffXfermode Demo3"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                items
        );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, PorterDuffXfermodeDemo1.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, PorterDuffXfermodeDemo2.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, PorterDuffXfermodeDemo3.class));
                }
            }
        });
    }
}

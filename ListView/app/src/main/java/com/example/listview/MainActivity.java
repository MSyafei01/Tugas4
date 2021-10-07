package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {
    ListView ListViewMonth;
    String[] months;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewMonth = findViewById(R.id.lvMonth);
        months = new DateFormatSymbols().getMonths();//data array nama bulan
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);//fungsi untuk menampilkan datalist melalui adapter
        ListViewMonth.setAdapter(adapter);

        //action klik
        ListViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View View, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda klik bulan : " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
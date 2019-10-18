package com.example.uts_ppb_d1041161026;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMateri extends AppCompatActivity {

    TextView txtJudul;
    ListView ListMateri;
    ArrayList<String> source;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String[]materi=new String[]{"BUTTON","TEXT FIELD","LAYOUT","LIST VIEW","TOAST"};


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);


        ListMateri = (ListView) findViewById(R.id.ListMateri);
        txtJudul = (TextView) findViewById(R.id.txtJudul);

        final List <String> ListElementsArrayList = new ArrayList<String>(Arrays.asList(materi));


        final ArrayAdapter < String > adapter = new ArrayAdapter < String >
                (ListMateri.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

//        source = new ArrayList<String>();

//        for (int i = 1; i <= materi.length; i++) {
//            source.add("Materi" + materi[i]);
//        }

//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, source);
        ListMateri.setAdapter(adapter);

        ListMateri.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String TampilListMateri = materi[position].toString();
                Intent intent = new Intent(ListMateri.this, detailMateri.class);
                intent.putExtra("Listviewclickvalue",TampilListMateri);
                startActivity(intent);
            }
        });


    }

}
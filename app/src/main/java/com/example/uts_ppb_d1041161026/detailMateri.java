package com.example.uts_ppb_d1041161026;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detailMateri extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi);

        textView=(TextView) findViewById(R.id.txtMateri);

        String TempHolder=getIntent().getStringExtra("Listviewclickvalue");

        textView.setText(TempHolder);

    }
}

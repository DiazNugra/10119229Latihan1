package com.example.a10119229latihan1;

//NIM                   : 10119229

//Nama                  : Diaz Maulidzan Nugraha

//Kelas                 : IF-6

//Tanggal Pengerjaan    : 17 - April - 2022

import androidx.appcompat.app.AppCompatActivity;

import android.text.Html;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.app);

        textView1.setText(Html.fromHtml("<b>DigiTeam</b><br>" +
                "Digital Together Everyone Achieve More <br>" +
                "Jabar Digital Service"));

    }
}
package com.example.android_baikiemtra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTiet extends AppCompatActivity {
    TextView txt_tencay,txt_tennhom,txt_tenthuoctinh, txt_mota;
    ImageView imgAnhmota, arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        arrow = (ImageView) findViewById(R.id.arrow);
        imgAnhmota =(ImageView) findViewById(R.id.img_mota) ;
        txt_tencay =(TextView) findViewById(R.id.txt_motatenbaihat) ;
        txt_tennhom =(TextView) findViewById(R.id.txt_motatencasi) ;
        txt_tenthuoctinh =(TextView) findViewById(R.id.txt_motatennnacsi);
        txt_mota =(TextView) findViewById(R.id.txt_mota);
        Intent intent  = getIntent();
        imgAnhmota.setImageResource(intent.getIntExtra("key1",0));
        txt_tencay.setText(intent.getStringExtra("key2"));
        txt_tenthuoctinh.setText(intent.getStringExtra("key3"));
        txt_tennhom.setText(intent.getStringExtra("key4"));
        txt_mota.setText(intent.getStringExtra("key5"));

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChiTiet.this, MainActivity.class));
            }
        });
    }
}
package com.example.lenovo.infomakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilanDetil extends AppCompatActivity {
    ImageView gambar;
    TextView tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_detil);
        Bundle b = getIntent().getExtras();
        tv3=(TextView)findViewById(R.id.resep);
        tv4=(TextView)findViewById(R.id.proced);
        gambar=(ImageView)findViewById(R.id.gambar);
        gambar.setImageResource(b.getInt("gambar"));
        tv3.setText(b.getString("res"));
        tv4.setText(b.getString("procedur"));
        setTitle(b.getString("label"));

    }
}

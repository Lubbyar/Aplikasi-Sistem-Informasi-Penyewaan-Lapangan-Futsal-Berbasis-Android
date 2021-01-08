package com.example.tubeslubby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout Content1,Content2,Content3;
    TextView txJudul1,txJudul2,txJudul3,txHarga1,txHarga2,txHarga3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Content1 = findViewById(R.id.content1);
        Content2 = findViewById(R.id.content2);
        Content3 = findViewById(R.id.content3);

        txJudul1 = findViewById(R.id.txjudul1);
        txJudul2 = findViewById(R.id.txjudul2);
        txJudul3 = findViewById(R.id.txjudul3);

        txHarga1 = findViewById(R.id.txharga1);
        txHarga2 = findViewById(R.id.txharga2);
        txHarga3 = findViewById(R.id.txharga3);

        Content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SewaActivity.class);
                intent.putExtra("foto", R.drawable.lap_a);
                intent.putExtra("judul", txJudul1.getText());
                intent.putExtra("harga", 120000);
                startActivity(intent);
            }
        });
        Content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SewaActivity.class);
                intent.putExtra("foto", R.drawable.lap_b);
                intent.putExtra("judul", txJudul2.getText());
                intent.putExtra("harga", 80000);
                startActivity(intent);
            }
        });
        Content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SewaActivity.class);
                intent.putExtra("foto", R.drawable.lap_c);
                intent.putExtra("judul", txJudul3.getText());
                intent.putExtra("harga", 80000);
                startActivity(intent);
            }
        });
    }
}
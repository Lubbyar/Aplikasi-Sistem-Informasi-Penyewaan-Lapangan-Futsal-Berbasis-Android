package com.example.tubeslubby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CekOutActivity extends AppCompatActivity {

    TextView txJam,txDus,txHargaSewa,txHargaMinuman, txTotal;
    Button btnTunai,btnNonTunai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_out);

        txHargaSewa = findViewById(R.id.txhargasewa);
        txHargaMinuman = findViewById(R.id.txhargaminuman);
        txJam = findViewById(R.id.txjam);
        txDus = findViewById(R.id.txdus);
        txTotal = findViewById(R.id.txtotal);
        btnTunai = findViewById(R.id.btntunai);
        btnNonTunai = findViewById(R.id.btnnontunai);

        Integer hargaSewa = getIntent().getIntExtra("sewa", 0);
        String valueSewa = hargaSewa.toString();
        txHargaSewa.setText("Rp. " + valueSewa);

        Integer hargaMinuman = getIntent().getIntExtra("minuman", 0);
        String valueMinuman = hargaMinuman.toString();
        txHargaMinuman.setText("Rp. " + valueMinuman);

        txJam.setText(getIntent().getStringExtra("jam"));
        txDus.setText(getIntent().getStringExtra("dus"));

        Integer Total = hargaSewa + hargaMinuman ;
        String valueTotal = Total.toString();
        txTotal.setText("Rp. " + valueTotal);

        btnTunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CekOutActivity.this, TunaiActivity.class);
                startActivity(intent);
            }
        });

        btnNonTunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CekOutActivity.this, NonTunaiActivity.class);
                startActivity(intent);
            }
        });
    }
}
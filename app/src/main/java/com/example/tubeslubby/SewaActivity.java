package com.example.tubeslubby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SewaActivity extends AppCompatActivity {
    EditText EtSewa,EtDus;
    Button BtnSewa;
    ImageView imgLap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa);

        imgLap = findViewById(R.id.imglap);
        Bundle bundle = getIntent().getExtras();
        int Foto = bundle.getInt("foto");
        imgLap.setImageResource(Foto);

        EtSewa = findViewById(R.id.etsewa);
        EtDus = findViewById(R.id.etdus);
        BtnSewa = findViewById(R.id.btnsewa);

        Integer Harga = getIntent().getIntExtra("harga", 0);

        BtnSewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SewaActivity.this, CekOutActivity.class);
                    intent.putExtra("jam", EtSewa.getText().toString());
                    intent.putExtra("dus", EtDus.getText().toString());
                    intent.putExtra("sewa", Integer.parseInt(EtSewa.getText().toString()) * Harga);
                    intent.putExtra("minuman", Integer.parseInt(EtDus.getText().toString()) * 20000);
                startActivity(intent);
            }
        });


    }
}
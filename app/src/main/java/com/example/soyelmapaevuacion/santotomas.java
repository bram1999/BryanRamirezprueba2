package com.example.soyelmapaevuacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class santotomas extends AppCompatActivity {
    Button ubicacion;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machupichu);
        ubicacion=(Button)findViewById(R.id.satelite);
        volver=(Button) findViewById(R.id.vuelvase);
        Bundle b= getIntent().getExtras();
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wan = new Intent(getApplicationContext(),MainActivity.class);
            }
        });
        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wan= new Intent(getApplicationContext(),stomastalcamapa.class);
                startActivity(wan);
            }
        });
    }
}
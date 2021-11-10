package com.example.soyelmapaevuacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sit;
    Button cont;
    ArrayList<String> valor = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sit = (Spinner) findViewById(R.id.Sitio);
        cont = (Button) findViewById(R.id.continuar);

        valor.add(".........");
        valor.add("Machu Picchu");
        valor.add("Isla de Pascua");
        valor.add("Universidad Santo Tomás Talca");
        ArrayAdapter<String> adaptador = new ArrayAdapter <>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valor);
        sit.setAdapter(adaptador);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sit.getSelectedItem() == "............") {
                    Toast.makeText(getApplicationContext(), "se debe seleccionar un sitio", Toast.LENGTH_LONG);

                }
                {
                    if (sit.getSelectedItem() == "Machu Picchu") {
                        String lugares = sit.getSelectedItem().toString();
                        Intent I = new Intent(getApplicationContext(), machupichu.class);
                        I.putExtra("sitio", lugares);
                        startActivity(I);

                    }
                    if (sit.getSelectedItem() == "Isla de Pascua") {
                        String lugares = sit.getSelectedItem().toString();
                        Intent I = new Intent(getApplicationContext(), isladepascua.class);
                        I.putExtra("sitio", lugares);
                        startActivity(I);

                    }
                    if (sit.getSelectedItem() == "Universidad Santo Tomás Talca") {
                        String lugares = sit.getSelectedItem().toString();
                        Intent I = new Intent(getApplicationContext(), santotomas.class);
                        I.putExtra("sitio", lugares);
                        startActivity(I);

                    }


                }


            }   }) ;
    }
}
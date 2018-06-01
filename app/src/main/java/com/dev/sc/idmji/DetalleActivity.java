package com.dev.sc.idmji;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView titulo;
    TextView detalles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        titulo= (TextView) findViewById(R.id.titulo);
        detalles= (TextView) findViewById(R.id.detalle);
        Himno h= (Himno) getIntent().getExtras().getSerializable("objeto");
        titulo.setText(h.getNombreHimno());
        detalles.setText(h.getDescripcion());


    }
}

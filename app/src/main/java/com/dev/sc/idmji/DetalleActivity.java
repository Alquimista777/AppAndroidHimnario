package com.dev.sc.idmji;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView titulo;
    TextView contenido;
    TextView coro;
    TextView contenido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        titulo = (TextView) findViewById(R.id.titulo);
        contenido = (TextView) findViewById(R.id.contenido);
        coro = (TextView) findViewById(R.id.coro);
        contenido2 = (TextView) findViewById(R.id.contenido2);

        Himno h= (Himno) getIntent().getExtras().getSerializable("objeto");
        titulo.setText(h.getNombreHimno());
        contenido.setText(h.getContenido());
        coro.setText(h.getCoro());
        contenido2.setText(h.getContenido2());



    }
}

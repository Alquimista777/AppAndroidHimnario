package com.dev.sc.idmji;



import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    MaterialSearchView searchView;
    private ListView listaDatos;
    private Adapter adapter;
    ArrayAdapter<Himno> arrayAdapter;
    ArrayList<Himno> listaHimnos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Buscador...");
            myToolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

            searchView = (MaterialSearchView) findViewById(R.id.search_view);
            searchView.closeSearch();
            listaDatos = (ListView) findViewById(R.id.listaHimnos);


        listaHimnos.add(
                new Himno("1", "LA DOXOLOGÍA: A DIOS EL PADRE "
                        , "A Dios, el Padre celestial,\n" +
                        "Al Hijo, nuestro Redentor,\n" +
                        "Y al eternal Consolador,\n" +
                        "Unidos todos alabad. Amén."));


        adapter = new ItemAdapter(this, listaHimnos);
        listaDatos.setAdapter((ListAdapter) adapter);


        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Himno h = (Himno) parent.getItemAtPosition(i);
                Intent detalleAvtivity = new Intent(getApplicationContext(), DetalleActivity.class);
                detalleAvtivity.putExtra("objeto", (Serializable) h);
                startActivity(detalleAvtivity);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;


    }
}


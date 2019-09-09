package com.dev.sc.idmji;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.dev.sc.idmji.entidades.ConexionSQLiteHelperr;
import com.dev.sc.idmji.utilidades.utilidades;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Himno> arListaHimnos = new ArrayList<>();
    MaterialSearchView searchView;
    ConexionSQLiteHelperr conSql;
    ListView lviewHimnos;
    Adapter adapter;
    Button button1;
    Himno himno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn_cambiar_registro);
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        searchView.closeSearch();
        lviewHimnos = (ListView) findViewById(R.id.mainListaHimnos);
        conSql = new ConexionSQLiteHelperr(this, "db_himnos", null, 1);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Buscar himno");
        myToolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        consultarListaHimnos();

        adapter = new ItemAdapter(this, arListaHimnos);
        lviewHimnos.setAdapter((ListAdapter) adapter);

        lviewHimnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Himno h = (Himno) parent.getItemAtPosition(i);
                Intent detalleAvtivity = new Intent(getApplicationContext(), DetalleActivity.class);
                detalleAvtivity.putExtra("objeto", (Serializable) h);
                startActivity(detalleAvtivity);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tent = new Intent(v.getContext(), RegistroHimnosActivity.class);
               v.getContext().startActivity(tent);
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
            }

            @Override
            public void onSearchViewClosed() {
                adapter = new ItemAdapter(MainActivity.this, arListaHimnos);
                lviewHimnos.setAdapter((ListAdapter) adapter);
            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText != null && !newText.isEmpty()) {
                    ArrayList<Himno> lstFound = new ArrayList<>();
                    for (Himno item : arListaHimnos) {
                        if (item.getId().contains(newText) || item.getNombreHimno().toLowerCase().contains(newText))
                            lstFound.add(item);
                    }
                    adapter = new ItemAdapter(MainActivity.this, lstFound);
                    lviewHimnos.setAdapter((ListAdapter) adapter);
                } else {
                    adapter = new ItemAdapter(MainActivity.this, arListaHimnos);
                    lviewHimnos.setAdapter((ListAdapter) adapter);
                }
                return true;
            }
        });
    }

    private void consultarListaHimnos() {
        SQLiteDatabase db = conSql.getReadableDatabase();
        arListaHimnos = new ArrayList<Himno>();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ utilidades.TABLA_HIMNO,null);

        while (cursor.moveToNext()){
            himno = new  Himno();
            himno.setId(cursor.getString(0));
            himno.setNombreHimno(cursor.getString(1));
            himno.setContenido(cursor.getString(2));
            himno.setCoro(cursor.getString(3));
            himno.setContenido2(cursor.getString(4));
            arListaHimnos.add(himno);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}






package com.dev.sc.idmji;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dev.sc.idmji.entidades.ConexionSQLiteHelperr;
import com.dev.sc.idmji.utilidades.utilidades;

public class RegistroHimnosActivity extends AppCompatActivity {
    EditText  campoid,nombre, contenido, contenido_dos, coro;
    Button btn;
    Button eliminar;
    ConexionSQLiteHelperr conx;
    ContentValues values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_himnos);

        campoid =  (EditText) findViewById(R.id.registroId);
        nombre =  (EditText) findViewById(R.id.registroNombre);
        contenido =  (EditText) findViewById(R.id.registroContenido);
        coro =  (EditText) findViewById(R.id.registroCoro);
        contenido_dos = (EditText) findViewById(R.id.registroContenido2);
        eliminar = findViewById(R.id.btnEliminar);
    }
    public  void onClick (View view){
    registrarH();
    }

    public void EliminarH(View view){
        eliminarHimno();
    }


    private void eliminarHimno (){
        ConexionSQLiteHelperr conx = new ConexionSQLiteHelperr(this,"db_himnos", null,1);
        SQLiteDatabase db = conx.getWritableDatabase();

        String[] parametros = {campoid.getText().toString()};
        db.delete(utilidades.TABLA_HIMNO, utilidades.CAMPO_ID+"=?",parametros);
        Toast.makeText(getApplicationContext(),"Ya se elimino el himno", Toast.LENGTH_SHORT).show();
        campoid.setText("");
        db.close();
    }

    public void registrarH(){

        conx = new ConexionSQLiteHelperr(this,"db_himnos", null,1);
        SQLiteDatabase db = conx.getWritableDatabase();

        values = new ContentValues();
        values.put(utilidades.CAMPO_ID,campoid.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE,nombre.getText().toString());
        values.put(utilidades.CAMPO_CONTENIDO,contenido.getText().toString());
        values.put(utilidades.CAMPO_CORO,coro.getText().toString());
        values.put(utilidades.CAMPO_CONTENIDO_DOS,contenido_dos.getText().toString());

        long idResultante = db.insert(utilidades.TABLA_HIMNO, utilidades.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(),"Id:  " + idResultante, Toast.LENGTH_SHORT).show();
        db.close();
    }
}

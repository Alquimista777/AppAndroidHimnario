package com.dev.sc.idmji;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    private ArrayList<Himno> listaHimnos;
    private Context context;


    public ItemAdapter(Context context, ArrayList<Himno>listaH){

        this.context=context;
        this.listaHimnos=listaH;
    }

    @Override
    public int getCount() {
        return this.listaHimnos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaHimnos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.item,null);
        }
        TextView nombreHimno=  (TextView)convertView.findViewById(R.id.nombreHimno);
        TextView id= (TextView)convertView.findViewById(R.id.id);
        //   TextView descripcion= (TextView)convertView.findViewById(R.id.description);

        nombreHimno.setText(listaHimnos.get(position).getNombreHimno());
        //descripcion.setText(listaHimnos.get(position).getDescripcion());
        id.setText(listaHimnos.get(position).getId());

        return convertView;

    }
}

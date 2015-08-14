package com.example.marcelo.agendacontatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by marcelo on 13/08/15.
 */
public class ContatosAdapter extends ArrayAdapter<Contato> {

    public ContatosAdapter(Context context, int resource, ArrayList<Contato> contatos) {
        super(context, resource, contatos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contato contato = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_layout, parent, false);
        }

        TextView nome = (TextView) convertView.findViewById(R.id.nome);
        TextView tel = (TextView) convertView.findViewById(R.id.tel);

        nome.setText(contato.getNome());
        tel.setText(String.valueOf(contato.getTel()));

         return convertView;
    }
}

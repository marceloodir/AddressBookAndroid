package com.example.marcelo.agendacontatos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView grid = (GridView) findViewById(R.id.gridview);

        ArrayList<Contato> contatos = new ArrayList<Contato>();
        contatos.add(new Contato("Marcelo Odir",5555));
        contatos.add(new Contato("Millena Freire", 444));
        contatos.add(new Contato("Odir Macedo", 333));

        ContatosAdapter adapter = new ContatosAdapter(this,0,contatos);
        grid.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.novo_contato) {
            return true;
        }

        if (id == R.id.sobre) {
            return true;
        }

        if (id == R.id.fechar) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void chamarClick(View v) {

        TextView tv = (TextView) v;
        Log.v("valor",tv.getText().toString());
    }
}

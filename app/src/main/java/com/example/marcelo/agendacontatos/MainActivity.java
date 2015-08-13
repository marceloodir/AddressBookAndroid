package com.example.marcelo.agendacontatos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView grid = (GridView) findViewById(R.id.gridView);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("valor um");
        lista.add("valor dois");
        lista.add("valor 3");

        ArrayAdapter adapter = new ArrayAdapter(this,R.id.lista, lista);
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
}

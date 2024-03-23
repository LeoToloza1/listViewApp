package com.leotoloza.listadeinmuebles;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }
public void generarListView(){
    ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
    ListView lv = findViewById(R.id.lista);
    lv.setAdapter(adapter);
}

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"San Luis", 20000));
        lista.add(new Inmueble(R.drawable.casa2,"Merlo", 150000));
        lista.add(new Inmueble(R.drawable.casa2,"Carpineria", 130000));
    }


}
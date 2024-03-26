package com.leotoloza.listadeinmuebles;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.leotoloza.listadeinmuebles.model.Inmueble;
import com.leotoloza.listadeinmuebles.ui.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.getListaInmuebles().observe(this, new Observer<List<Inmueble>>() {
            @Override
            public void onChanged(List<Inmueble> inmuebles) {
                generarListView(inmuebles);
            }
        });
    }

    private void generarListView(List<Inmueble> listaInmuebles) {
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.item, listaInmuebles, getLayoutInflater());
        ListView lv = findViewById(R.id.lista);
        lv.setAdapter(adapter);
    }
}
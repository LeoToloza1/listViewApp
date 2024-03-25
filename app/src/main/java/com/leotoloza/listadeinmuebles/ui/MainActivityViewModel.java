package com.leotoloza.listadeinmuebles.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.leotoloza.listadeinmuebles.model.Inmueble;
import com.leotoloza.listadeinmuebles.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Inmueble>>listaInmuebles;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaInmuebles = new MutableLiveData<>();
        cargarDatos();
    }
    public LiveData<List<Inmueble>> getListaInmuebles(){
        return listaInmuebles;
    }
    private void cargarDatos(){
        List<Inmueble> lista= new ArrayList<>();
        lista.add(new Inmueble(R.drawable.casa1,"San Luis", 20000));
        lista.add(new Inmueble(R.drawable.casa2,"Merlo", 150000));
        lista.add(new Inmueble(R.drawable.casa2,"Carpineria", 130000));
        listaInmuebles.setValue(lista);
    }
}

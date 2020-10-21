package com.florenciaolivieri.petagrammascotas2.vistafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.florenciaolivieri.petagrammascotas2.pojo.Mascota;
import com.florenciaolivieri.petagrammascotas2.R;
import com.florenciaolivieri.petagrammascotas2.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        //el layout fragment_recyclerview está contenido en el View v
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        //manipulo el RecyclerView de Mascotas
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotaFoto);

        //defino cómo mostrar el RecyclerView  en una lista (LinearLayout)
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        //pongo orientación vertical para mostrar las tarjetas
        glm.setOrientation(LinearLayoutManager.VERTICAL);

        //Indico que el RecyclerView se comporte como un LinearLayout
        listaMascotas.setLayoutManager(glm);

        // Inicializo lista de Mascotas
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;

    }
    public void inicializarAdaptador() {
        //instancio MascotaAdaptador que recibe la lista de mascotas inicializasa
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 7));
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 4));
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 8));
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 5));
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 10));
        mascotas.add(new Mascota(R.drawable.foto_perro_salchicha,"", 2));

    }
}

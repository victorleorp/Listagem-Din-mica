package com.example.listagemdinmica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.listagemdinmica.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private RecyclerView recyclerView;
    private List<Fruta> listaFrutas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        recyclerView = binding.recyclerView;

        //listagem de filmes
        this.criarFruta();

        //Configurar o adapter
        Adapter adapter = new Adapter(listaFrutas);


        //layout manager
        //configurar o recycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void criarFruta(){
        Fruta uva = new Fruta(R.drawable.uvaa, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Sweet Uva", "18/kg");
        listaFrutas.add(uva);

        Fruta uva2 = new Fruta(R.drawable.uvaa, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Sweet Uva", "18/kg");
        listaFrutas.add(uva2);

        Fruta uva3 = new Fruta(R.drawable.uvaa, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelaamarela, R.drawable.estrelacinza, R.drawable.bookmark, R.drawable.send, "Sweet Uva", "18/kg");
        listaFrutas.add(uva3);

    }
}
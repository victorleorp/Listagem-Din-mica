package com.example.listagemdinmica;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.MyViewHolder>{

    private List<Fruta> listaFrutas;

    public Adapter(List<Fruta> lista){
        this.listaFrutas = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Fruta filme = listaFrutas.get(position);

        holder.imageFruta.setImageResource(filme.getImageFruta());
        holder.estrelaUm.setImageResource(filme.getEstrelaUm());
        holder.estrelaDois.setImageResource(filme.getEstrelaDois());
        holder.estrelaTres.setImageResource(filme.getEstrelaTres());
        holder.estrelaQuatro.setImageResource(filme.getEstrelaQuatro());
        holder.estrelaCinza.setImageResource(filme.getEstrelaCinza());
        holder.bookMark.setImageResource(filme.getBookMark());
        holder.send.setImageResource(filme.getSend());

    }

    @Override
    public int getItemCount() {
        return listaFrutas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageFruta;
        ImageView estrelaUm;
        ImageView estrelaDois;
        ImageView estrelaTres;
        ImageView estrelaQuatro;
        ImageView estrelaCinza;
        ImageView bookMark;
        ImageView send;
        TextView precoKg;
        TextView nomeFruta;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageFruta = itemView.findViewById(R.id.ivCachoUva);
            estrelaUm = itemView.findViewById(R.id.ivEstrelaUm);
            estrelaDois = itemView.findViewById(R.id.ivEstrelaDois);
            estrelaTres = itemView.findViewById(R.id.ivEstrelaTres);
            estrelaQuatro = itemView.findViewById(R.id.ivEstrelaQuatro);
            estrelaCinza = itemView.findViewById(R.id.ivEstrelaCinza);
            bookMark = itemView.findViewById(R.id.ivbookmark);
            send = itemView.findViewById(R.id.ivSend);
            nomeFruta = itemView.findViewById(R.id.tvSweetGrapes);
            precoKg = itemView.findViewById(R.id.tvPreco);

        }
    }
}

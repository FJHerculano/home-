package com.example.windows.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by windows on 06/04/2018.
 */

public class Adapter extends RecyclerView.Adapter {

    private Context context;
    private List<String> lista;
    private View view;

    public Adapter(List<String>lista, Context context) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.text,parent,false
        );

        ViewHolder viewholder = new ViewHolder (view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final ViewHolder variavel = (ViewHolder) holder;
        variavel.texto.setText(lista.get(position));
        variavel.texto2.setText(lista.get(position));

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}

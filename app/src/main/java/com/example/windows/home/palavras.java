package com.example.windows.home;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;
import java.util.ArrayList;
public class palavras extends AppCompatActivity {

    // criando  variaveis para desenvolver a recycleView, o gerenciador (Layoutmanager), o Adapter, e o
    // dataset que é meu conjunto/lista de palavras.

    private RecyclerView recycler;
    private RecyclerView.LayoutManager manager;
    private RecyclerView.Adapter adapter;
    private List<String> dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // seta activity palavra para indentificar que o uso do recycleView faz parte dele

        setContentView(R.layout.activity_palavras);

        // a variavel Recycler torna se o My_recycler_View para poder habilitar suas alterações
        // my_Recycler_View é o id , do recyclerView no  activity palavras


        recycler = (RecyclerView) findViewById(R.id.my_recycler_view);

        // manipulando agr a variavel manager , criando atraves dela um novo objeto
        // (LinearLayoutManager), que é o gerenciador da recycleView, onde tras por exemplo que ela é vertical

        manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(manager);

        // dataset tras as palavras.

        dataset = new ArrayList<String>();

        dataset.add("teste");
        dataset.add("é nos");
        dataset.add("belezinha");

        adapter = new Adapter (dataset,this);
        recycler.setAdapter(adapter);


    }

    // estrutura que abre o dialogo na tela , tras as suas
    // configurações de wordDialogo que é outra classe

    public void abrirDialogo (View view){
        WordDialog dialog = new WordDialog();
        dialog.show(getFragmentManager(), "WordDialog");

    }

    public void text_botao (View view){

        CaixaDePalavras palavra = new CaixaDePalavras();
        palavra.show(getFragmentManager(),"CaixaDePalavras");

    }

    public void text_botao2 (View view){

        CaixaDePalavras palavra = new CaixaDePalavras();
        palavra.show(getFragmentManager(),"CaixaDePalavras");

    }


    // apenas um intent para abrir a proxima pagina do projeto

    public void proxima_pag (View view){

        Intent intent = new Intent(this, praticar.class);
        startActivity(intent);
    }

    }


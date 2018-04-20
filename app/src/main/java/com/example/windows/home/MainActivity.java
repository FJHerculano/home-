package com.example.windows.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialogo(View view){
        HomeDialogAlert dialog = new HomeDialogAlert();
        dialog.show(getFragmentManager(),"HomeDialogAlert");

    }



    public void proximaTela(View view){

        Intent intent = new Intent(this, palavras.class);
        startActivity(intent);
    }

}




package com.example.windows.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by windows on 06/04/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder{


    final TextView texto;
    final TextView texto2;

    public ViewHolder(View itemView) {
        super(itemView);
        texto = (TextView)itemView.findViewById(R.id.texto);
        texto2 = (TextView)itemView.findViewById(R.id.texto2);
    }
}

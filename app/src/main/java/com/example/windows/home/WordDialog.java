package com.example.windows.home;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

/**
 * Created by windows on 23/03/2018.
 */

// extends DialogFragment é padrão

public class WordDialog extends DialogFragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // usando o builder para 'setar' os botões, o layout e a
        // mensageem que retornara na activity palavras

        builder
                .setMessage(R.string.dialog_complete2)
                .setView(R.layout.dialog_lay2)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        // retorna o builder

        return builder.create();
    }

}

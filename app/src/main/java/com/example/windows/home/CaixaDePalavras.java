package com.example.windows.home;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Created by windows on 16/04/2018.
 */

public class CaixaDePalavras extends DialogFragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder

        // preciso descobrir como setar o adapter/viewHolder, para passar a lista de palavras

                .setView(R.layout.text)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();

    }
}
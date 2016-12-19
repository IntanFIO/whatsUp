package com.example.intanfaoziyah.des19application.adapter;

import android.app.Activity;
import android.content.Context;
import android.telephony.SignalStrength;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intanfaoziyah.des19application.R;

import java.util.List;

/**
 * Created by Intan Faoziyah on 19/12/2016.
 */

public class KontakAdapter extends ArrayAdapter<String> {

    private final Activity contex;
    private  final String[] telp;
    private final String[] name;
    private final Integer[] image;

    public KontakAdapter(Activity contex, String[] name, String[] telp, Integer[] image){
        super(contex, R.layout.kontak_list, name);
        this.contex = contex;
        this.name = name;
        this.telp = telp;
        this.image = image;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.kontak_list, null, true);

        TextView tvNama = (TextView) rowView.findViewById(R.id.tv_nama);
        TextView tvNomor = (TextView) rowView.findViewById(R.id.tv_nomor);
        ImageView imageUser = (ImageView) rowView.findViewById(R.id.img_user);

        tvNama.setText(name[position]);
        tvNomor.setText(telp[position]);
        imageUser.setImageResource(image[position]);
        return  rowView;
    };

}

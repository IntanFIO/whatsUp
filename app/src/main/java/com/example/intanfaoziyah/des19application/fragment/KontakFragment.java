package com.example.intanfaoziyah.des19application.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.intanfaoziyah.des19application.R;
import com.example.intanfaoziyah.des19application.adapter.KontakAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends Fragment {
    private ListView listView;

    String[] nama = {"Intan Faoziyah", "Tri Wahyu", "Siti Fatimah", "Galuh Oka", "Sarah Gita"};
    String[] telp = {"1234", "2345", "3456", "4567", "5678"};
    Integer[] image = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};


    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        KontakAdapter adapter = new KontakAdapter(getActivity(), nama, telp, image);
        listView = (ListView) view.findViewById(R.id.lv_kontak);
        listView.setAdapter(adapter);



        return view;
    }

}

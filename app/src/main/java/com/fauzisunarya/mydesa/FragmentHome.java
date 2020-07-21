package com.fauzisunarya.mydesa;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {

    LinearLayout lrDesaWisata, lrSeputarDesa, lrLokasi, lrGaleri;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lrDesaWisata = view.findViewById(R.id.lr_desaWisata);
        lrDesaWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DesaWisataActivity.class);
                startActivity(intent);
            }
        });

        lrSeputarDesa = view.findViewById(R.id.lr_SeputarDesa);
        lrSeputarDesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SeputarDesaActivity.class);
                startActivity(intent);
            }
        });

        lrLokasi = view.findViewById(R.id.lr_lokasi);
        lrLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LokasiDesaActivity.class);
                startActivity(intent);
            }
        });

        lrGaleri = view.findViewById(R.id.lr_galeri);
        lrGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GaleriActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}

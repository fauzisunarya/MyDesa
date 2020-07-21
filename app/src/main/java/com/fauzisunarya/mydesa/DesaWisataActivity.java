package com.fauzisunarya.mydesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class DesaWisataActivity extends AppCompatActivity {
    private RecyclerView rvDesa;
    private ArrayList<Desa> list = new ArrayList<>();
//    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_wisata);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbd20e")));
        getSupportActionBar().setTitle("Desa Wisata");

        rvDesa = findViewById(R.id.rv_desa);
        rvDesa.setHasFixedSize(true);

        list.addAll(getListDesa());
        showRecyclerGrid();
    }

    public ArrayList<Desa> getListDesa() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.data_photo);
        ArrayList<Desa> listDesa = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Desa hero = new Desa();
            hero.setName(dataName[i]);
            hero.setDescription(dataDescription[i]);
            hero.setPhoto(dataPhoto[i]);
            listDesa.add(hero);
        }
        return listDesa;
    }


    private void showRecyclerGrid(){
        rvDesa.setLayoutManager(new GridLayoutManager(this, 2));
        DesaWisataAdapter gridHeroAdapter = new DesaWisataAdapter(list);
        rvDesa.setAdapter(gridHeroAdapter);
    }
}

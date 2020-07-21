package com.fauzisunarya.mydesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class SeputarDesaActivity extends AppCompatActivity {
    ConstraintLayout expandableView;
    Button arrowBtn;
    CardView cardView;

    private RecyclerView rvDesa;
    private ArrayList<Desa> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seputar_desa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbd20e")));
        getSupportActionBar().setTitle("Seputar Desa");

        rvDesa = findViewById(R.id.rv_desa);
        rvDesa.setHasFixedSize(true);

        list.addAll(getListDesa());
        showRecyclerCard();

//        expandableView = findViewById(R.id.expandableView);
//        arrowBtn = findViewById(R.id.arrowBtn);
//        cardView = findViewById(R.id.cardView);

//        arrowBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (expandableView.getVisibility()==View.GONE){
//                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
//                    expandableView.setVisibility(View.VISIBLE);
//                    arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
//                } else {
//                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
//                    expandableView.setVisibility(View.GONE);
//                    arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
//                }
//            }
//        });
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

    private void showRecyclerCard(){
        rvDesa.setLayoutManager(new LinearLayoutManager(this));
        SeputarDesaAdapter seputarDesaAdapter = new SeputarDesaAdapter(list);
        rvDesa.setAdapter(seputarDesaAdapter);
    }
}

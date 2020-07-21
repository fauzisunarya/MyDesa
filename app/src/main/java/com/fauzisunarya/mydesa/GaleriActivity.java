package com.fauzisunarya.mydesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbd20e")));
        getSupportActionBar().setTitle("Galeri");


        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://visitingjogja.com/wp-content/uploads/2017/12/tanjung.jpg", "Desa Wisata Tanjung"));
        slideModels.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/desawisatapentingsari.jpg", "Desa Wisata Pentingsari"));
        slideModels.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/desa-wisata-karang-tengah.jpg", "Desa Wisata Karang Tengah"));
        slideModels.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/kebun-agung.jpg", "Desa Wisata Kebon Agung"));
        imageSlider.setImageList(slideModels, true);

        ImageSlider imageSlider2 = findViewById(R.id.slider2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/nglinggo.jpg", "Desa Wisata Nglinggo"));
        slideModels2.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/manding.jpg", "Desa Wisata Manding"));
        slideModels2.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/desa-wisata-candran.jpg", "Desa Wisata Candran"));
        slideModels2.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/sambi.jpg", "Desa Wisata Sambi"));
        imageSlider2.setImageList(slideModels2, true);

        ImageSlider imageSlider3 = findViewById(R.id.slider3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/desa-wisata-kembang-arum.jpg", "Desa Wisata Kembang Arum"));
        slideModels3.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/tembi.jpg", "Desa Wisata Tembi"));
        slideModels3.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/sby.jpg", "Desa Wisata Kasongan"));
        imageSlider3.setImageList(slideModels3, true);

        ImageSlider imageSlider4 = findViewById(R.id.slider4);
        List<SlideModel> slideModels4 = new ArrayList<>();
        slideModels4.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/banyusumurup.jpg", "Desa Wisata Banyusumurup"));
        slideModels4.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/trumpon2.jpg", "Desa Wisata Trumpon"));
        slideModels4.add(new SlideModel("https://www.yukpiknik.com/wp-content/uploads/2015/10/kerebet.jpg", "Desa Wisata Krebet"));
        imageSlider4.setImageList(slideModels4, true);


    }
}

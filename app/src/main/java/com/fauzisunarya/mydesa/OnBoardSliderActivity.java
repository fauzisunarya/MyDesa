package com.fauzisunarya.mydesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardSliderActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Desa Wisata")
                .setContent("Menampilkan list desa wisata")
                .setBackgroundColor(Color.parseColor("#FBD200")) // int background color
                .setDrawable(R.drawable.board_village) // int top drawable
                .setSummary("Fitur menampilkan list desa wisata")
                .build());
        addFragment(new Step.Builder().setTitle("Galeri")
                .setContent("Menampilkan galeri foto desa wisata")
                .setBackgroundColor(Color.parseColor("#FBD200")) // int background color
                .setDrawable(R.drawable.board_galeri) // int top drawable
                .setSummary("Fitur menampilkan galeri foto desa wisata")
                .build());
        addFragment(new Step.Builder().setTitle("Lokasi")
                .setContent("Mencari lokasi desa wisata")
                .setBackgroundColor(Color.parseColor("#FBD200")) // int background color
                .setDrawable(R.drawable.board_location) // int top drawable
                .setSummary("Fitur mencari lokasi desa wisata")
                .build());

        setCancelText("Skip");
    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardSliderActivity.this, SplashScreenActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

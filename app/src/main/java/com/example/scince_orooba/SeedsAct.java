package com.example.scince_orooba;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeedsAct extends AppCompatActivity {
    Button Flax,anise,cumin,nigella,chia,halim,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seeds);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void setUpView() {
        Flax = findViewById(R.id.flax);
        anise = findViewById(R.id.anise);
        cumin = findViewById(R.id.cumin);
        nigella = findViewById(R.id.nigella);
        chia = findViewById(R.id.chia);
        halim = findViewById(R.id.halim);
        back = findViewById(R.id.backSeeds);
    }

    public void backSeedsbtn(View view) {
        finish();
    }

    public void halimbtn(View view) {
        startActivity(new Intent(this, HalimAct.class));
    }

    public void nigellabtn(View view) {
        startActivity(new Intent(this, NigelleAct.class));
    }

    public void chiabtn(View view) {
        startActivity(new Intent(this, ChiaAct.class));
    }

    public void cuminbtn(View view) {
        startActivity(new Intent(this, CuminAct.class));
    }

    public void anisebtn(View view) {
        startActivity(new Intent(this, AniseAct.class));
    }

    public void flaxbtn(View view) {
        startActivity(new Intent(this, FlaxAct.class));
    }
}
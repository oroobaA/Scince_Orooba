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

public class HerbsAct extends AppCompatActivity {
    Button mint, sage, chamamole, zaatar, fellty, marjoram, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herbs);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setUpView();
    }
    public void setUpView() {
        mint = findViewById(R.id.mint);
        sage = findViewById(R.id.sage);
        chamamole = findViewById(R.id.chamamole);
        zaatar = findViewById(R.id.zaatar);
        fellty = findViewById(R.id.felty);
        marjoram = findViewById(R.id.majoram);
        back = findViewById(R.id.backHerbs);
    }

    public void backHerbsbtn(View view) {
        finish();
    }

    public void mintbtn(View view) {
        startActivity(new Intent(this, MintAct.class));
    }

    public void sagebtn(View view) {
        startActivity(new Intent(this, SageAct.class));
    }

    public void chamamolebtn(View view) {
        startActivity(new Intent(this, ChamomileAct.class));
    }

    public void zaatarbtn(View view) {
        startActivity(new Intent(this, ZaatarAct.class));
    }

    public void feltybtn(View view) {
        startActivity(new Intent(this, FeltyAct.class));
    }

    public void majorambtn(View view) {
        startActivity(new Intent(this, marjoram.class));
    }
}
package com.example.scince_orooba;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signIn extends AppCompatActivity {
    EditText name, password;
    Button logIn;
    CheckBox remmember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setUpViews();
    }

    public void setUpViews() {
        name = findViewById(R.id.usernameEdt);
        password = findViewById(R.id.passwordEdt);
        logIn = findViewById(R.id.signbtn);
        remmember = findViewById(R.id.checkBox2);
    }

    public void onclick(View view) {
        if(remmember.isChecked()){
            shared();
        }

        startActivity(new Intent(this, ListView.class));
    }

    @Override
    public void onStop() {
        super.onStop();
        if (remmember.isChecked()) {
            shared();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        name.setText("");
        password.setText("");
        remmember.setChecked(false);
        SharedPreferences sharedPreferences = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();

    }


    @Override
    public void onPause() {
        super.onPause();
        shared();
    }

    public void shared() {
        SharedPreferences sharedPrefrence = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefrence.edit();
        editor.putString("name", name.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.apply();
    }

    @Override
    public void onResume() {
        super.onResume();
        getShared();
    }

    public void getShared() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared", MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String password = sharedPreferences.getString("password", "");
        this.name.setText(name);
        this.password.setText(password);
    }

}
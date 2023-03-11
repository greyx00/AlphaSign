package com.example.progetto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int CAMERA_REQUEST = 100;
    private Button bttContinua = null;
    private int colorSelected = 1;
    private Button bttGiallo = null;
    private Button bttVerde = null;
    private Button bttBlu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttContinua = findViewById(R.id.bttContinua);
        bttGiallo = findViewById(R.id.radiog);
        bttVerde = findViewById(R.id.radiov);
        bttBlu = findViewById(R.id.radiob);
        bttGiallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelected = 1;
            }
        });
        bttVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelected = 2;
            }
        });
        bttBlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelected = 3;
            }
        });
        bttContinua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newActivity();
            }

            public void newActivity() {
                verifyPermissions();
                Intent activity2Intent = new Intent(getApplicationContext(), Translator.class);
                activity2Intent.putExtra("colore", colorSelected);
                startActivity(activity2Intent);
            }

        });
    }


    private void verifyPermissions() {
        Context context = this.getApplicationContext();
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(context, "Per continuare devi concedere i permessi della Fotocamera!",
                    Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{
                            Manifest.permission.CAMERA
                    },
                    CAMERA_REQUEST);
        }
    }
}
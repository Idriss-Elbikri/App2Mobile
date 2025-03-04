package com.example.app2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nom, phone, email, adress;
    private Button bn;
    private Spinner ville;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        adress = findViewById(R.id.adress);
        bn = findViewById(R.id.bn);
        ville = findViewById(R.id.ville);

        bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String Nom = nom.getText().toString();
                String Phone = phone.getText().toString();
                String Email = email.getText().toString();
                String Adress = adress.getText().toString();
                String Ville = ville.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Nom", Nom);
                intent.putExtra("Phone", Phone);
                intent.putExtra("Email", Email);
                intent.putExtra("Adress", Adress);
                intent.putExtra("Ville", Ville);

                startActivity(intent);
            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
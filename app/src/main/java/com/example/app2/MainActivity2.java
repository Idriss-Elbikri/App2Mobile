package com.example.app2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView main2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main2);

        main2 = findViewById(R.id.main2);

        String Nom = getIntent().getStringExtra("Nom");
        String Email = getIntent().getStringExtra("Email");
        String Phone = getIntent().getStringExtra("Phone");
        String Adress = getIntent().getStringExtra("Adress");
        String Ville = getIntent().getStringExtra("Ville");

        String recap = "Nom : " + Nom + "\n" +
                "Email : " + Email + "\n" +
                "Phone : " + Phone + "\n" +
                "Adresse : " + Adress + "\n" +
                "Ville : " + Ville + "\n" ;
        Toast.makeText(MainActivity2.this, recap, Toast.LENGTH_LONG).show();

        main2.setText(recap);
    }
}
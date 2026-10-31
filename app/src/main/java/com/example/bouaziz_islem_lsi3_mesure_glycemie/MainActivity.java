package com.example.bouaziz_islem_lsi3_mesure_glycemie;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnConsulter;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnConsulter = findViewById(R.id.btnConsulter);
        msg = findViewById(R.id.msg);
        btnConsulter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                msg.setText("felecitations!");
            }
        });

    }
}
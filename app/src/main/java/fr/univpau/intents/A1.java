package fr.univpau.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suivant);

        Button mSuivant = findViewById(R.id.btn_suivant);
        mSuivant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent gameActivityIntent = new Intent(A1.this, A2.class);
        startActivity(gameActivityIntent);
    }
}
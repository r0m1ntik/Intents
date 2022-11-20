package fr.univpau.intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class A4 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suivant);

        Button mSuivant = findViewById(R.id.btn_suivant);
        mSuivant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent gameActivityIntent = new Intent(A4.this, A5.class);
        startActivity(gameActivityIntent);
    }
}

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
        // on recuper la valeur
        Intent mIntent = getIntent();
        String mString = mIntent.getStringExtra("editText");

        // passé les parametre dans l'intent que A1 nous a envoyé
        mIntent = new Intent(A4.this, A5.class);
        mIntent.putExtra("editText", mString);
        startActivity(mIntent);

        System.out.println("A4: " + mIntent.getStringExtra("editText"));
    }
}

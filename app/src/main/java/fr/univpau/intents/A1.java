package fr.univpau.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class A1 extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mSuivant = findViewById(R.id.btn_suivant);
        editText = findViewById(R.id.edit_text);

        mSuivant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent mIntent = new Intent(A1.this, A2.class);
        // passé les parametre dans l'intent que A1 nous a envoyé
        mIntent.putExtra("editText", editText.getText().toString());
        System.out.println(editText.getText().toString() + " --- " + mIntent.getStringExtra("editText"));
        startActivity(mIntent);
    }
}
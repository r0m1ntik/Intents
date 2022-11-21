package fr.univpau.intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class A6 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        Spinner mSpinner = findViewById(R.id.spinner_text);
        System.out.println(mSpinner.getSelectedItem().toString());

        Button mButton = findViewById(R.id.button_envoyer);
        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // get the text
        Spinner mSpinner = findViewById(R.id.spinner_text);
        String stringToPassBack = mSpinner.getSelectedItem().toString();

        // put the String to pass back into an Intent and close this activity
        Intent intent = new Intent();
        intent.putExtra("keyName", stringToPassBack);
        setResult(RESULT_OK, intent);
        finish();
    }
}

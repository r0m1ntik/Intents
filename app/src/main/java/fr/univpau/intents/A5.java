package fr.univpau.intents;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class A5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dernier);

        Intent mIntent = getIntent();
        System.out.println("A5: " + mIntent.getStringExtra("editText"));
    }
}

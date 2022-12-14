package fr.univpau.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class A5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dernier);

        Intent mIntent = getIntent();
        System.out.println("A5: " + mIntent.getStringExtra("editText"));

        mIntent = new Intent(this, A6.class);
        startActivityIntent.launch(mIntent);
    }

    ActivityResultLauncher<Intent> startActivityIntent = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    assert data != null;
                    System.out.printf("L'utilisateur %s a selectionner : ----- %s, il est sympa ? %s%n",
                            Foo.getInstance().userLogin, data.getStringExtra("keyName"),
                            Foo.getInstance().estSympa);
                }
            });
}

package dev.rezaur.cactowise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button gymno;
    private Button astro;
    private Button echino;
    private Button grafted;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        gymno = findViewById(R.id.gymnocalycium);
        astro = findViewById(R.id.astrophytum);
        echino = findViewById(R.id.echinocactus);
        grafted = findViewById(R.id.grafted);
        about = findViewById(R.id.aboutBtn);
    }

    public void gymnoPage(View view) {
        Intent intent = new Intent(this, Gymnocalycium.class);
        startActivity(intent);
    }

    public void astroPage(View view) {
        Intent intent = new Intent(this, Astrophytum.class);
        startActivity(intent);
    }

    public void echinoPage(View view) {
        Intent intent = new Intent(this, Echinocactus.class);
        startActivity(intent);
    }

    public void graftedPage(View view) {
        Intent intent = new Intent(this, GraftedCactus.class);
        startActivity(intent);
    }

    public void aboutPage(View view) {
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
}
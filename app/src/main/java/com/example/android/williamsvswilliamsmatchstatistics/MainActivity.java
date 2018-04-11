package com.example.android.williamsvswilliamsmatchstatistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.williamsvswilliamsmatchstatistics.R;

public class MainActivity extends AppCompatActivity {
    /**
     * Tracks aces for Venus.
     */
    int aceVenus = 0;

    /**
     * Tracks aces for Serena.
     */
    int aceSerena = 0;

    /**
     * Tracks break points for Venus.
     */
    int breakVenus = 0;

    /**
     * Tracks break points for Serena.
     */
    int breakSerena = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase aces for Venus by 1.
     */
    public void addAceVenus(View v) {
        aceVenus += 1;
        displayForAceVenus(aceVenus);
    }

    /**
     * Increase aces for Serena by 1.
     */
    public void addAceSerena(View v) {
        aceSerena += 1;
        displayForAceSerena(aceSerena);
    }

    /**
     * Increase break points for Venus by 1.
     */
    public void addBreakVenus(View v) {
        breakVenus += 1;
        displayForBreakVenus(breakVenus);
    }

    /**
     * Increase break points for Serena by 1.
     */
    public void addBreakSerena(View v) {
        breakSerena += 1;
        displayForBreakSerena(breakSerena);
    }


    /**
     * Resets aces and break points for Venus and Serena.
     */
    public void pointReset(View v) {
        int pointReset = 0;
        displayForAceVenus(pointReset);
        displayForAceSerena(pointReset);
        displayForBreakVenus(pointReset);
        displayForBreakSerena(pointReset);
    }


    /**
     * Displays total aces for Venus.
     */
    public void displayForAceVenus(int aceVenus) {
        TextView aceView = findViewById(R.id.venus_ace);
        aceView.setText(String.valueOf(aceVenus));
    }

    /**
     * Displays total aces for Serena.
     */
    public void displayForAceSerena(int aceSerena) {
        TextView aceView = findViewById(R.id.serena_ace);
        aceView.setText(String.valueOf(aceSerena));
    }

    /**
     * Displays total break points for Venus.
     */
    public void displayForBreakVenus(int breakVenus) {
        TextView breakView = findViewById(R.id.venus_break);
        breakView.setText(String.valueOf(breakVenus));
    }

    /**
     * Displays total break points for Serena.
     */
    public void displayForBreakSerena(int breakSerena) {
        TextView breakView = findViewById(R.id.serena_break);
        breakView.setText(String.valueOf(breakSerena));
    }
}

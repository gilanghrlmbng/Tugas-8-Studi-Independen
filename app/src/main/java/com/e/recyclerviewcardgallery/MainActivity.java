package com.e.recyclerviewcardgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView login;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        button = findViewById(R.id.btn);

        login.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == login) {
            Toast.makeText(getApplicationContext(), "Login", Toast.LENGTH_LONG).show();
        } else if (v == button) {
            Snackbar sbsukses = Snackbar.make(v.getRootView(), "Pendaftaran Sukses", Snackbar.LENGTH_LONG);
            sbsukses.show();
        }

    }

    public void openSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, "Pendaftaran Sukses", Snackbar.LENGTH_LONG);
        snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorbg));
        snackbar.show();
    }
}
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
    private TextView forgotpw;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forgotpw = findViewById(R.id.forgot);
        login = findViewById(R.id.btn);

        forgotpw.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == forgotpw) {
            Toast.makeText(getApplicationContext(), "Anda lupa password", Toast.LENGTH_LONG).show();
        } else if (v == login) {
            Snackbar sbsukses = Snackbar.make(v.getRootView(), "Login Succeed", Snackbar.LENGTH_LONG);
            sbsukses.show();
        }

    }

    public void openSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, "Ini adalah snackbar", Snackbar.LENGTH_LONG);
        snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorbg));
        snackbar.show();
    }
}
package com.unip.applmjhotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaTelaHome(View view) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void irParaTelaServicos(View view) {
        Intent intent = new Intent(getApplicationContext(), ServicosActivity.class);
        startActivity(intent);
    }

    public void irParaTelaSobre(View view) {
        Intent intent = new Intent(getApplicationContext(), SobreActivity.class);
        startActivity(intent);
    }

    public void fecharApp(View view) {
        Toast.makeText(getBaseContext(), "Volte sempre...", Toast.LENGTH_LONG).show();
        finish();
    }
}
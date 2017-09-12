package com.murillo.conexaohttp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent i = getIntent();
        String opcao = i.getStringExtra("opcao");
        ((TextView)findViewById(R.id.txt1)).setText(opcao);
    }

    public void retornar(View v) {
        Intent i = new Intent(this, MainActivity.class);
//        i.putExtra("nome","Angoti");
//        i.putExtra("idade",47);
        startActivity(i);
    }
}

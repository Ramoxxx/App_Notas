package br.com.etecia.app_notas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Clique no Cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mALterar:
                Toast.makeText(getApplicationContext(),
                        "Clique no Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Clique no Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),
                        "Clique no Buscar",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}


package br.com.temdetudo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final); // substitua pelo layout correto

        // Instanciando o botão de voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(Final.this, MainActivity.class);
            startActivity(intent);
        });

        // Pegando as informações da tela anterior e retornando ao usuário
        //Bundle
        Bundle infos = getIntent().getExtras();

        if (infos != null) {
            String nome = infos.getString("nomeUser");

            // Texto para o usuário
            TextView texto = findViewById(R.id.txtBoaVindasCadastro);
            texto.setText("Bem-vindo, " + nome + "!");
        }
    }
}
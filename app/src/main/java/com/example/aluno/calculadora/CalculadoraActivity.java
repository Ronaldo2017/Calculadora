package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends AppCompatActivity {

    EditText edtNumeros;
    Button btnSete, btnOito, btnNove, btnVezes,btnQuatro,btnCinco,btnSeis,btnMenos,btnUm,btnDois,
            btnTres,btnMais,btnPonto,btnZero,btnIgual,btnDividir,btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btnSete = (Button) findViewById(R.id.btnSete);
        btnOito = (Button) findViewById(R.id.btnOito);
        btnNove = (Button) findViewById(R.id.btnNove);
        btnVezes = (Button) findViewById(R.id.btnVezes);
        btnQuatro = (Button) findViewById(R.id.btnQuatro);
        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnUm = (Button) findViewById(R.id.btnUm);
        btnDois = (Button) findViewById(R.id.btnDois);
        btnTres = (Button) findViewById(R.id.btnTres);
        btnMais = (Button) findViewById(R.id.btnMais);
        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        edtNumeros = (EditText) findViewById(R.id.edtNumeros);

      btnSete.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              edtNumeros.setText(edtNumeros.getText() + "7");
          }
      });
        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "8");
            }
        });
        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "9");
            }
        });
        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "6");
            }
        });
        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "1");
            }
        });
        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "3");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + "0");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText("");
            }
        });
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText("");
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText("");
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText("");
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText("");
            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeros.setText(edtNumeros.getText() + ".");
            }
        });
    }
}

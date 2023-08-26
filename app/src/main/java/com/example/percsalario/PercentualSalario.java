package com.example.percsalario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PercentualSalario extends AppCompatActivity {

    EditText edtSal, edtRes;
    RadioGroup rdgPerc;
    RadioButton rdbP40, rdbP45, rdbP50;
    Button btnNS;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentual_salario);
        getSupportActionBar().hide();

        edtSal = findViewById(R.id.edtSal);
        rdgPerc = findViewById(R.id.rdgPerc);
        btnNS = findViewById(R.id.btnNS);
        rdbP40 = findViewById(R.id.rdbP40);
        rdbP45 = findViewById(R.id.rdbP45);
        rdbP50 = findViewById(R.id.rdbP50);
        edtRes = findViewById(R.id.edtRes);
    }

    public void calcular(View V) {
        double Sal = Double.parseDouble(edtSal.getText().toString());
        double acrescimo = 0, valor = 0;

        if(rdbP40.isChecked()){
            acrescimo = Sal * 0.4;
            valor = acrescimo + Sal;
            edtRes.setText(String.format("%.2f", valor));
        }

        else if(rdbP45.isChecked())
        {
            acrescimo = Sal * 0.45;
            valor = acrescimo + Sal;
            edtRes.setText(String.format("%.2f", valor));

        }

        else if(rdbP50.isChecked())
        {
            acrescimo = Sal * 0.50;
            valor = acrescimo + Sal;
            edtRes.setText(String.format("%.2f", valor));
        }


    }
}
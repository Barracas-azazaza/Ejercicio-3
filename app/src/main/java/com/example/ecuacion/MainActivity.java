package com.example.ecuacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private TextView resultado1;
    private TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Puente con la vista
        Casteo();
    }

    public void Casteo(){
        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        num3 = (EditText) findViewById(R.id.etNum3);
        resultado1 = (TextView) findViewById(R.id.tvResultado1);
        resultado2 = (TextView) findViewById(R.id.tvResultado2);
    }

    public void Calcular(View view){
        double numer1 = Double.parseDouble(num1.getText().toString());
        double numer2 = Double.parseDouble(num2.getText().toString());
        double numer3 = Double.parseDouble(num3.getText().toString());
        double raiz = (Math.sqrt(Math.pow(numer2,2)-4*numer1*numer3));
        double result1 = ((-1*numer2)+raiz)/(2*numer1);
        double result2 = ((-1*numer2)-raiz)/(2*numer1);
        resultado1.setText(""+result1);
        resultado2.setText(""+result2);
    }
}
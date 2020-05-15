package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttontambah, buttonkurang, buttonbagi, buttonkali, buttonakar, buttonpangkat;
    Button buttonclear, buttonsamadengan;

    public static double nilaisekarang = 0;
    public static String operasisekarang = "";
    public static double  hasil =0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("    Muhamamd Nurhidayat A.Ms ");
        toolbar.setSubtitle("      13020170051");
        toolbar.setLogo(R.drawable.logo);
    init();
    }
    void init() {
        textView = findViewById(R.id.textView);
        button0 = findViewById(R.id.button15);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttonbagi = findViewById(R.id.button21);
        buttonbagi.setOnClickListener(this);
        buttonkali = findViewById(R.id.button22);
        buttonkali.setOnClickListener(this);
        buttonkurang = findViewById(R.id.button23);
        buttonkurang.setOnClickListener(this);
        buttontambah = findViewById(R.id.button20);
        buttontambah.setOnClickListener(this);
        buttonakar = findViewById(R.id.button11);
        buttonakar.setOnClickListener(this);
        buttonpangkat = findViewById(R.id.button12);
        buttonpangkat.setOnClickListener(this);
        buttonclear = findViewById(R.id.button10);
        buttonclear.setOnClickListener( this);
        buttonsamadengan = findViewById(R.id.button17);
        buttonsamadengan.setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {

            switch (v.getId()){
                case R.id.button15:
                    textView.setText(textView.getText().toString().trim()+"0");
                    break;
                case R.id.button2:
                    textView.setText(textView.getText().toString().trim()+"1");
                    break;
                case R.id.button:
                    textView.setText(textView.getText().toString().trim()+"2");
                    break;
                case R.id.button3:
                    textView.setText(textView.getText().toString().trim()+"3");
                    break;
                case R.id.button4:
                    textView.setText(textView.getText().toString().trim()+"4");
                    break;
                case R.id.button5:
                    textView.setText(textView.getText().toString().trim()+"5");
                    break;
                case R.id.button6:
                    textView.setText(textView.getText().toString().trim()+"6");
                    break;
                case R.id.button7:
                    textView.setText(textView.getText().toString().trim()+"7");
                    break;
                case R.id.button8:
                    textView.setText(textView.getText().toString().trim()+"8");
                    break;
                case R.id.button9:
                    textView.setText(textView.getText().toString().trim()+"9");
                    break;

                case R.id.button22:
                    operasisekarang = "kali";
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    break;
                case R.id.button20:
                    operasisekarang = "tambah";
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    break;
                case R.id.button21:
                    operasisekarang = "bagi";
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    break;
                case R.id.button23:
                    operasisekarang = "kurang";
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    break;

                case R.id.button11:
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    hasil = Math.sqrt(nilaisekarang);
                    textView.setText(String.valueOf((float) hasil));

                    break;
                case R.id.button12:
                    nilaisekarang = Double.parseDouble(textView.getText().toString());
                    hasil = nilaisekarang*(nilaisekarang);
                    textView.setText(String.valueOf((int)hasil));
                    break;
                case R.id.button10:
                    textView.setText("");
                    break;

                case R.id.button17:
                    if (operasisekarang.equals("tambah")){
                        hasil = nilaisekarang+Double.parseDouble(textView.getText().toString().trim());
                        textView.setText(String.valueOf((int)hasil));

                    }
                    if (operasisekarang.equals("kurang")){
                        hasil = nilaisekarang-Double.parseDouble(textView.getText().toString().trim());
                        textView.setText(String.valueOf((int)hasil));

                    }

                    if (operasisekarang.equals("kali")){
                        hasil = nilaisekarang*Double.parseDouble(textView.getText().toString().trim());
                        textView.setText(String.valueOf((int)hasil));

                    }

                    if (operasisekarang.equals("bagi")){
                        hasil = nilaisekarang/Double.parseDouble(textView.getText().toString().trim());
                        textView.setText(String.valueOf((float) hasil));
                    }
                    validasikosong();

    }
    }
public void validasikosong(){
if(operasisekarang.equals("") ||textView.equals(" ")){
    Toast.makeText(this, "harap masukkan nilai", Toast.LENGTH_SHORT).show();

}
}
}





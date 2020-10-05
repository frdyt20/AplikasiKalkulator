package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText angka1EditText , angka2EditText;
    private Button btn_plus , btn_minus , btn_bagi , btn_kali , btn_delete;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1EditText = findViewById(R.id.angka1EditText);
        angka2EditText = findViewById(R.id.angka2EditText);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_bagi = findViewById(R.id.btn_bagi);
        btn_kali = findViewById(R.id.btn_kali);
        btn_delete = findViewById(R.id.btn_delete);
        hasilTextView = findViewById(R.id.tv_result);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1EditText.getText().length() > 0) && (angka2EditText.getText().length() > 0)) {
                    int angka1 = Integer.parseInt(angka1EditText.getText().toString());
                    int angka2 = Integer.parseInt(angka2EditText.getText().toString());
                    int hasil = angka1 + angka2;
                    hasilTextView.setText(Integer.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama " +
                                    "& angka kedua terlebih dahulu",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1EditText.getText().length() > 0) && (angka2EditText.getText().length() > 0)) {
                    int angka1 = Integer.parseInt(angka1EditText.getText().toString());
                    int angka2 = Integer.parseInt(angka2EditText.getText().toString());
                    int hasil = angka1 - angka2;
                    hasilTextView.setText(Integer.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama " +
                                    "& angka kedua terlebih dahulu",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1EditText.getText().length() > 0) && (angka2EditText.getText().length() > 0)) {
                    float angka1 = Float.parseFloat(angka1EditText.getText().toString());
                    float angka2 = Float.parseFloat(angka2EditText.getText().toString());
                    float hasil = angka1 / angka2;
                    hasilTextView.setText(Float.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama " +
                                    "& angka kedua terlebih dahulu",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1EditText.getText().length() > 0) && (angka2EditText.getText().length() > 0)) {
                    int angka1 = Integer.parseInt(angka1EditText.getText().toString());
                    int angka2 = Integer.parseInt(angka2EditText.getText().toString());
                    int hasil = angka1 * angka2;
                    hasilTextView.setText(Integer.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama " +
                                    "& angka kedua terlebih dahulu",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1EditText.setText("");
                angka2EditText.setText("");
                hasilTextView.setText("0");
                angka1EditText.requestFocus();
            }
        });
    }
}
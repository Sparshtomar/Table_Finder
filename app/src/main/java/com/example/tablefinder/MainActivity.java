package com.example.tablefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber2;
    private Button buttton;
    private TextView textView25;
    private TextView textView26;
    private TextView textView27;
    private TextView textView28;
    private TextView textView29;
    private TextView textView30;
    private TextView textView31;
    private TextView textView32;
    private TextView textView33;
    private TextView textView34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttton = findViewById(R.id.button);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);
        textView31 = findViewById(R.id.textView31);
        textView32 = findViewById(R.id.textView32);
        textView33 = findViewById(R.id.textView33);
        textView34 = findViewById(R.id.textView34);
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextNumber2.getText().toString();
                int a = Integer.parseInt(s);
                textView25.setText(a + " * 1" + "   =  " + 1*a);
                textView26.setText(a + " * 2" + "   =  " + 2*a);
                textView27.setText(a + " * 3" + "   =  " + 3*a);
                textView28.setText(a + " * 4" + "   =  " + 4*a);
                textView29.setText(a + " * 5" + "   =  " + 5*a);
                textView30.setText(a + " * 6" + "   =  " + 6*a);
                textView31.setText(a + " * 7" + "   =  " + 7*a);
                textView32.setText(a + " * 8" + "   =  " + 8*a);
                textView33.setText(a + " * 9" + "   =  " + 9*a);
                textView34.setText(a + " * 10" + "   =  " + 10*a);

            }
        });

    }
}
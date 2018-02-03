package com.example.home.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText txtMin, txtMax;
    TextView txtResult;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMin = findViewById(R.id.editTextMin);
        txtMax = findViewById(R.id.editTextMax);
        txtResult = findViewById(R.id.textViewResult);
        btnClick = findViewById(R.id.buttonClick);

        Random rd = new Random();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String min = txtMin.getText().toString();
                String max = txtMin.getText().toString();
                if(min.isEmpty() || max.isEmpty())
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ số", Toast.LENGTH_SHORT).show();
                else {
                    Random rd = new Random();
                    int d = Integer.parseInt(max) - Integer.parseInt(min) + 1;
                    int n = rd.nextInt(d) + Integer.parseInt(txtMin.getText().toString());
                    txtResult.setText(n + "");
                }
            }
        });
    }

}



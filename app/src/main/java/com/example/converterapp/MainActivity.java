package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputFeet;
    EditText inputInches;
    Button   btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputFeet=findViewById(R.id.inputFeet);
        inputInches=findViewById(R.id.inputInches);
        btnConvert=findViewById(R.id.btnConvert);

        inputInches.setEnabled(false);
    }

    public void convert(View view) {
        String val=inputFeet.getText().toString();
        float feet=Float.parseFloat(val);
        String inches=String.valueOf(feet*12);
        inputInches.setText( inches);
        Toast toast=Toast.makeText(getApplicationContext(), inches,Toast.LENGTH_SHORT);
        toast.show();
    }
}
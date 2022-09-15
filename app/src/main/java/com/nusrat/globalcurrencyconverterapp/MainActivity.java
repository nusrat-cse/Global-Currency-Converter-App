package com.nusrat.globalcurrencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertNow(View view) {
        EditText editText;
        editText = findViewById(R.id.editText);

        String taka = editText.getText().toString();

        TextView textView1= findViewById(R.id.displayText);
        Double takainDouble = Double.parseDouble(taka);
        Double dollarinDouble = takainDouble * 0.096;
        String dollarInString = String.valueOf(dollarinDouble);
        textView1.setText(dollarInString);

        TextView textView2= findViewById(R.id.rupi);
        Double rupinDouble = takainDouble * 0.76;
        String rupiInString = String.valueOf(rupinDouble);
        textView2.setText(rupiInString);

        TextView textView3= findViewById(R.id.euro);
        Double euroinDouble = takainDouble * 0.0096;
        String euroInString = String.valueOf(euroinDouble);
        textView3.setText(euroInString);
    }
}
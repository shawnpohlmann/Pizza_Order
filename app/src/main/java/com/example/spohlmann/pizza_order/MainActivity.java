package com.example.spohlmann.pizza_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTotal;
    RadioButton radioSmall;
    RadioButton radioMedium;
    RadioButton radioLarge;
    double total;
    CheckBox cbCheese;
    CheckBox cbDelivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioSmall = (RadioButton) findViewById(R.id.small);
        radioMedium = (RadioButton) findViewById(R.id.medium);
        radioLarge = (RadioButton) findViewById(R.id.large);
        tvTotal = (TextView) findViewById(R.id.total);
        cbCheese = (CheckBox) findViewById(R.id.cheese);
        cbDelivery = (CheckBox) findViewById(R.id.delivery);

    }
    public void onClick(View view) {
        total = 0;
        if (radioSmall.isChecked()) {
            total = total + 7;
        }
        if (radioMedium.isChecked()) {
            total = total + 9;
        }
        if (radioLarge.isChecked()) {
            total = total + 13;
        }
        if (cbCheese.isChecked()) {
            total = total + 1.75;
        }
        if (cbDelivery.isChecked()) {
            total = total + 2.50;
        }
        tvTotal.setText(String.format("Your total bill is $%.2f", total));
    }
}

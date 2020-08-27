package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText amountEditText = findViewById(R.id.amountEditText);
        Log.i("Button", "Logged In");
        String amount = amountEditText.getText().toString();
        Log.i("Amount Entered", amount);
        double amountNum = Double.parseDouble(amount);
        Toast.makeText(this,("$" + amount + " = \u20B9" + (amountNum * 73.79) + "!"),Toast.LENGTH_SHORT).show();
        ImageView image =  findViewById(R.id.usdImageView);
        image.setImageResource(R.drawable.inr);

    }


}
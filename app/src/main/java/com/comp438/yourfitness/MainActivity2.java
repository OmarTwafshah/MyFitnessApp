package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private Spinner spinner;
    private EditText editTextNumberOfMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinearLayout currentLayout =
                (LinearLayout) findViewById(R.id.main_layout);
        currentLayout.setBackgroundColor(Color.GRAY);

        editTextNumberOfMonth = findViewById(R.id.numberOfMonths);
        spinner = findViewById(R.id.spinner);

        populateSpinner();

    }

    private void populateSpinner() {

        ChoiceFactory factory = new ChoiceFactory();
        IChoiceDB objBooks = factory.getModel();
        String[] cat = objBooks.getname();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, cat);

        spinner.setAdapter(adapter);

    }

    public void FindPriceOnClick(View view) {

        try {
            PriceFactory factory = new PriceFactory();
            IPriceDB objPrice = factory.getModel();
            int numberMonth = Integer.parseInt(editTextNumberOfMonth.getText().toString());
            List<Price> prices = objPrice.getPrice(numberMonth);
            String data = "";
            for (Price b : prices) {
                data = "The Price For " + numberMonth + " Month is : " + b.getPricePerMonth();
            }

            Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "Please Enter number just from 1 to 12", Toast.LENGTH_SHORT).show();
        }

    }

    public void GoSelectOnClick(View view) {
        ChoiceFactory factory = new ChoiceFactory();
        IChoiceDB objBooks = factory.getModel();
        String item = "";
        item = spinner.getSelectedItem().toString();
        List<Choice> Books = objBooks.getChoice(item);
        String data = "";
        for (Choice b : Books) {
            data = b.getName();
        }
        Intent intent;
        if (data.equals("MainActivity3")) {
            intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        } else if (data.equals("MainActivity4")) {
            intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        } else if (data.equals("MainActivity5")) {
            intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
        }


    }
}
package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity3 extends AppCompatActivity {
    private EditText editTextweight ;
    private EditText editTextheight ;
    private EditText editTextBMINumber ;
    private EditText editTextBMIWord ;
    private int counter = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextweight = findViewById(R.id.editTextWeight);
        editTextheight = findViewById(R.id.editTextHeight);
        editTextBMINumber = findViewById(R.id.TheBMINumber);
        editTextBMIWord = findViewById(R.id.TheBMIWord);
    }

    public void CalculateOnClick(View view) {
        double weight = Double.parseDouble(editTextweight.getText().toString());
        double height = Double.parseDouble(editTextheight.getText().toString());

        double bmi = weight/(height*height);
        counter++ ;
        editTextBMINumber.setText(String.valueOf(bmi));
        if(bmi > 0 && bmi < 18.5){
            editTextBMIWord.setText("Underweight");
        }else if(bmi >=18.5 && bmi < 24.9 ){
            editTextBMIWord.setText("Normal weight");
        }else if(bmi >=24.9 && bmi < 29.9){
            editTextBMIWord.setText("Overweight");
        }else if(bmi >= 29.9){
            editTextBMIWord.setText("Obesity");
        }

    }

    public void LoadDataOnClick(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("123", "");
        BMI[] bmi = gson.fromJson(str, BMI[].class);
        Toast.makeText(this, "number of People calculate BMI " + bmi.length
                , Toast.LENGTH_SHORT).show();
    }

    public void SaveDataOnClick(View view) {
        BMI[] bmi = new BMI[1];
        bmi[0] = new BMI(editTextBMIWord.getText().toString() , Double.parseDouble(editTextheight.getText().toString()));
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String bmiString = gson.toJson(bmi);
        editor.putString("123", bmiString);
        editor.commit();
        Toast.makeText(this, "Data Saved:\n" + bmiString,
                Toast.LENGTH_SHORT).show();

    }
}
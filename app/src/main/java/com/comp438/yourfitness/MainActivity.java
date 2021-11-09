package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String PASS = "PASS";
    public static final String FLAG = "FLAG";
    private EditText editName ;
    private EditText editPassWord ;
    private CheckBox checkBox ;
    private SharedPreferences preferences ;
    private SharedPreferences.Editor editor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        setUpSharedPrefs();
        checkPrefs();
    }

    private void checkPrefs() {
        boolean flag = preferences.getBoolean(FLAG , false);

        if(flag){

            String name = preferences.getString(NAME , "");
            String password = preferences.getString(PASS , "");
            editName.setText(name);
            editPassWord.setText(password);
            checkBox.setChecked(true);
        }
    }

    private void setUpSharedPrefs() {
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
    }

    private void setUpViews() {
        editName = findViewById(R.id.editTextUserName);
        editPassWord = findViewById(R.id.editTextPassword);
        checkBox = findViewById(R.id.RememberPassword);
    }

    public void LogInClick(View view) {
        String name = editName.getText().toString();
        String password = editPassWord.getText().toString();
        if(checkBox.isChecked()){
            editor.putString(NAME,name);
            editor.putString(PASS,password);
            editor.putBoolean(FLAG,true);
            editor.commit();

            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);



        }

    }
}
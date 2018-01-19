package com.example.dawiddelimata.connectwithnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ReadingFromDB extends AppCompatActivity {

    EditText name, quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_from_db);
        name = (EditText) findViewById(R.id.et_name);
        quantity = (EditText) findViewById(R.id.et_quantity);


    }

    public void OnGet(View v){
        String str_name = name.getText().toString();
        String str_quantity = quantity.getText().toString();

        String type = "get";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, str_quantity);
    }
}
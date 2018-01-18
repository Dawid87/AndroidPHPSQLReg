package com.example.dawiddelimata.connectwithnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;

public class UserAccount extends AppCompatActivity {

    EditText name, quantity, age, username;
    TextView namee, surnamee, agee, usernamee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);
        name = (EditText) findViewById(R.id.et_name);
        quantity = (EditText) findViewById(R.id.et_quantity);
        //age = (EditText) findViewById(R.id.et_age);
        //username = (EditText) findViewById(R.id.et_username);


    }

//    public void OnGet(View v){
////        String str_name = name.getText().toString();
////        String str_surname = surname.getText().toString();
////        String str_age = age.getText().toString();
////        String str_username = username.getText().toString();
////
////        String type = "get";
////        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
////        backgroundWorker.execute(type, str_name, str_surname, str_age, str_username);
////
////        EditText name2 = (EditText) findViewById(R.id.et_name2);
////        name2.setText(str_name);
////        EditText surname2 = (EditText) findViewById(R.id.et_surname2);
////        surname2.setText(str_surname);
////        EditText age2 = (EditText) findViewById(R.id.et_age2);
////        age2.setText(str_age);
////        EditText username2 = (EditText) findViewById(R.id.et_username2);
////        username2.setText(str_username);
//
//        String str_quantity = quantity.getText().toString();
//        String str_name = name.getText().toString();
//        //String str_password = password.getText().toString();
//        String type = "send";
//        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
//        backgroundWorker.execute(type, str_name, str_quantity);
//    }

    public void OnSend(View v){
//        String str_name = name.getText().toString();
//        String str_surname = surname.getText().toString();
//        String str_age = age.getText().toString();
//        String str_username = username.getText().toString();
//
//        String type = "get";
//        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
//        backgroundWorker.execute(type, str_name, str_surname, str_age, str_username);
//
//        EditText name2 = (EditText) findViewById(R.id.et_name2);
//        name2.setText(str_name);
//        EditText surname2 = (EditText) findViewById(R.id.et_surname2);
//        surname2.setText(str_surname);
//        EditText age2 = (EditText) findViewById(R.id.et_age2);
//        age2.setText(str_age);
//        EditText username2 = (EditText) findViewById(R.id.et_username2);
//        username2.setText(str_username);

        String str_name = name.getText().toString();
        String str_quantity = quantity.getText().toString();
        //String str_password = password.getText().toString();
        String type = "send";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, str_quantity);
    }
}

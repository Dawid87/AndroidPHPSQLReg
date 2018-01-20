package com.example.dawiddelimata.connectwithnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.List;

public class ReadingFromDB extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter apter;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ListItem);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

//    public void OnGet(View v){
//        String str_name = name.getText().toString();
//        String str_quantity = quantity.getText().toString();
//
//        String type = "get";
//        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
//        backgroundWorker.execute(type, str_name, str_quantity);
//    }
}

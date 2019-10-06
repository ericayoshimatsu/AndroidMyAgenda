package com.motchan.myagenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.motchan.myagenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "HELLO WORLD!", Toast.LENGTH_LONG).show();
        // activate layout
        setContentView(R.layout.activity_main_list);
        setTitle("My List");
        // configure list
        List<String> alunos = new ArrayList<>(Arrays.asList("Ed","Edd","Eddy"));
        ListView listOfMain = findViewById(R.id.activity_main_list_listView);
        listOfMain.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));


    }
}

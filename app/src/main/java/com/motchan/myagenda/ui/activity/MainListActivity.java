package com.motchan.myagenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.motchan.myagenda.DAO.EntryDAO;
import com.motchan.myagenda.R;

public class MainListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Toast.makeText(this, "HELLO WORLD!", Toast.LENGTH_LONG).show();
        // activate layout
        setContentView(R.layout.activity_main_list);
        setTitle("My List");
        // configure list

        FloatingActionButton addEntryButton = findViewById(R.id.activity_main_list_fab_add);
        addEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainListActivity.this, AddFormActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        EntryDAO dao = new EntryDAO();

        //List<String> alunos = new ArrayList<>(Arrays.asList("Ed","Edd","Eddy"));
        ListView listOfMain = findViewById(R.id.activity_main_list_listView);
        listOfMain.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.alltEntries() ));
    }
}

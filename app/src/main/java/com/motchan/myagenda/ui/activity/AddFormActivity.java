package com.motchan.myagenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.motchan.myagenda.DAO.EntryDAO;
import com.motchan.myagenda.R;
import com.motchan.myagenda.model.ListEntry;

public class AddFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_form);

        final EntryDAO dao = new EntryDAO();

        final EditText nameField = findViewById(R.id.activity_add_form_name);
        final EditText phoneField = findViewById(R.id.activity_add_form_phone);
        final EditText emailField = findViewById(R.id.activity_add_form_email);

        Button saveButton = findViewById(R.id.activity_add_form_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
                String phone = phoneField.getText().toString();
                String email = emailField.getText().toString();

                ListEntry listEntry = new ListEntry(name, phone, email);
                /*Toast.makeText(AddFormActivity.this,
                        listEntry.getName() + " - " + listEntry.getPhone() + " - " + listEntry.getEmail(),
                        Toast.LENGTH_SHORT).show();
                */
                dao.save(listEntry);

                startActivity(new Intent(AddFormActivity.this, MainListActivity.class));

            }
        });

    }

}

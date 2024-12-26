package com.example.phone_book;



import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContactListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        ListView contactListView = findViewById(R.id.contactListView);

        if (MainActivity.contactList.isEmpty()) {
            Toast.makeText(this, "No contacts to display", Toast.LENGTH_SHORT).show();
            return;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                MainActivity.contactList
        );
        contactListView.setAdapter(adapter);

        contactListView.setOnItemClickListener((parent, view, position, id) -> {
            if (position >= 0 && position < MainActivity.contactDetailsList.size()) {
                String contactDetails = MainActivity.contactDetailsList.get(position);
                Toast.makeText(ContactListActivity.this, contactDetails, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(ContactListActivity.this, "Error fetching contact details", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

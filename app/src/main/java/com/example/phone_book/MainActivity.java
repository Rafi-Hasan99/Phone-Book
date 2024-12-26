package com.example.phone_book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editName, editPhone, editEmail;
    private Button btnSave, btnViewContacts;

    // Static lists to store contact data
    public static ArrayList<String> contactList = new ArrayList<>();
    public static ArrayList<String> contactDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        editName = findViewById(R.id.editName);
        editPhone = findViewById(R.id.editPhone);
        editEmail = findViewById(R.id.editEmail);
        btnSave = findViewById(R.id.btnSave);
        btnViewContacts = findViewById(R.id.btnViewContacts);

        // Save button functionality
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                String phone = editPhone.getText().toString().trim();
                String email = editEmail.getText().toString().trim();

                if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    contactList.add(name);
                    contactDetailsList.add("Name: " + name + "\nPhone: " + phone + "\nEmail: " + email);

                    editName.setText("");
                    editPhone.setText("");
                    editEmail.setText("");

                    Toast.makeText(MainActivity.this, "Contact saved successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // View contacts button functionality
        btnViewContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contactList.isEmpty()) {
                    Toast.makeText(MainActivity.this, "No contacts to display", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, ContactListActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

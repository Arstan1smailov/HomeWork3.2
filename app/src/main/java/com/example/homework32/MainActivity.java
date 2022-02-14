package com.example.homework32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ed1, ed2, ed3;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(Intent.ACTION_SEND).setPackage("com.google.android.gm");
                send.putExtra(Intent.EXTRA_EMAIL, new String[]{ed1.getText().toString()});
                send.putExtra(Intent.EXTRA_SUBJECT, ed2.getText().toString());
                send.putExtra(Intent.EXTRA_TEXT, ed3.getText().toString());
                send.setType("message/rfc822");
                startActivity(send);
            }
        });
    }}

package com.example.sampleandroidapplication0002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String SENT_MESSAGE = "Received Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.received_message);
        textView.setText(intent.getStringExtra(SENT_MESSAGE));
    }
}

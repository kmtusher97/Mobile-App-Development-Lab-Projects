package com.example.sampleandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * after clicking on Select Button
     * @param view
     */
    public void onClickSelect(View view) {
        Spinner options = findViewById(R.id.spinner_options);
        TextView textView = findViewById(R.id.textView_selection);

        String selectedOption = options.getSelectedItem().toString();
        textView.setText(selectedOption + " is selected!!!!!!");
    }
}

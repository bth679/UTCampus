package com.example.tan.utcampus;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class locationActivity extends AppCompatActivity {

    Spinner spinner;
    String SpinnerValue;
    Intent i;

    private String[] options = { "PCL", "Tower", "Jester", "Gregory Gym"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(locationActivity.this, android.R.layout.simple_list_item_1, options);
        spinner.setAdapter(adapter);

        // Adding listener method on spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerValue = (String) spinner.getSelectedItem();

                switch (SpinnerValue) {
                    case "PCL":
                        i = new Intent(locationActivity.this, pclwebview.class);
                        startActivity(i);
                        break;
                    case "Tower":
                        i = new Intent(locationActivity.this, towerwebview.class);
                        startActivity(i);
                        break;
                    case "Jester":
                        i = new Intent(locationActivity.this, jesterwebview.class);
                        startActivity(i);
                        break;
                    case "Gregory Gym":
                        i = new Intent(locationActivity.this, gregwebview.class);
                        startActivity(i);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}


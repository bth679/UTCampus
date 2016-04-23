package com.example.tan.utcampus;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String SpinnerValue;
    Intent i;

    MediaPlayer player;

    private String[] options = { "Please Select Something", "Introduction to Campus", "Main Buildings and Location to Campus", "Listen to UT fight song"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, options);
        spinner.setAdapter(adapter);

        // Adding listener method on spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerValue = (String) spinner.getSelectedItem();

                switch (SpinnerValue) {
                    case "Introduction to Campus":
                        i = new Intent(MainActivity.this, introductionActivity.class);
                        startActivity(i);
                        break;
                    case "Main Buildings and Location to Campus":
                        i = new Intent(MainActivity.this, locationActivity.class);
                        startActivity(i);
                        break;
                    case "Listen to UT fight song":
                        i = new Intent(MainActivity.this, musicActivity.class);
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


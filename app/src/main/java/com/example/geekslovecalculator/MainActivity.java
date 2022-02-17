package com.example.geekslovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int counter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner languages = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.languages));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languages.setAdapter(myadapter);


    }

    public void calculate (View view) {
        EditText text = (EditText) findViewById(R.id.Name);
        String Name = text.getText().toString();
        if (Name.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter a name", Toast.LENGTH_SHORT).show();

        } else {
            ImageView image1 = findViewById(R.id.java_image);
            ImageView image2 = findViewById(R.id.python_image);
            ImageView image3 = findViewById(R.id.javascript_image);
            ImageView image5 = findViewById(R.id.php_image);
            ImageView image4 = findViewById(R.id.html_image);
            ImageView image6 = findViewById(R.id.cplus_image);
            ImageView image7 = findViewById(R.id.c_image);
            image1.setTranslationY(2000);
            image2.setTranslationY(2000);
            image3.setTranslationY(2000);
            image4.setTranslationY(2000);
            image5.setTranslationY(2000);
            image6.setTranslationY(2000);
            image7.setTranslationY(2000);


            Random rand = new Random();
            int upper = 100;
            int rand_int = rand.nextInt(upper);
            TextView percentage = findViewById(R.id.Percentage);
            String perc = Integer.toString(rand_int);
            percentage.setText(perc);

            Spinner spinner = (Spinner) findViewById(R.id.spinner);
            String language = spinner.getSelectedItem().toString();
            if (spinner.getSelectedItemId() == 0) {
                percentage.setText(language);
                image1.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 1) {
                image2.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 4) {

                image3.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 6) {
                image4.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 2) {
                image5.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 3) {
                image6.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }
            if (spinner.getSelectedItemId() == 5) {
                image7.animate().translationYBy(-2000).rotation(3600).setDuration(600);
            }


            if (counter == 1) {
                TextView name1 = findViewById(R.id.Name1);
                TextView language1 = findViewById(R.id.language1);
                TextView percentage1 = findViewById(R.id.percentage1);
                name1.setText(Name);
                language1.setText(language);
                percentage1.setText(perc);
                counter++;

            } else if (counter == 2) {
                TextView name = findViewById(R.id.name2);
                TextView lang = findViewById(R.id.language2);
                TextView percentag = findViewById(R.id.percentage2);
                name.setText(Name);
                lang.setText(language);
                percentag.setText(perc);
                counter++;

            } else if (counter == 3) {
                TextView name = findViewById(R.id.name3);
                TextView lang = findViewById(R.id.language3);
                TextView percentag = findViewById(R.id.percentage3);
                name.setText(Name);
                lang.setText(language);
                percentag.setText(perc);
                counter++;

            } else if (counter == 4) {
                TextView name = findViewById(R.id.name4);
                TextView lang = findViewById(R.id.language4);
                TextView percentag = findViewById(R.id.percentage4);
                name.setText(Name);
                lang.setText(language);
                percentag.setText(perc);
                counter = 1;

            }


        }
    }

}
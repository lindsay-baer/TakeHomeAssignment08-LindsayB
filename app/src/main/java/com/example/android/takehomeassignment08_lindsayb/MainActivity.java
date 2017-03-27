package com.example.android.takehomeassignment08_lindsayb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference placeRef = database.getReference("Place");
    private DatabaseReference titleRef = database.getReference("Hike Name");
    private EditText countryName;
    private EditText addCity;
    private EditText addPopulation;
    private CheckBox goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = (EditText) findViewById(R.id.title_country);
        addCity = (EditText) findViewById(R.id.add_city);
        goBack = (CheckBox) findViewById(R.id.go_back);
        addPopulation = (EditText) findViewById(R.id.add_population);
    }

    public void set(View view) {
        titleRef.setValue(countryName.getText().toString());
    }

    public void add(View view) {
        String city = addCity.getText().toString();
        int population = Integer.parseInt(addPopulation.getText().toString());
        boolean back = goBack.isChecked();

        Country fun = new Country(city, population, back);
        placeRef.push().setValue(fun);
    }

}
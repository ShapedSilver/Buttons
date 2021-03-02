package com.example.buttons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buttons.R;
import com.example.buttons.dashboard;
import com.example.buttons.newMeal;
import com.example.buttons.selectMeals;
import com.example.buttons.settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button selectMealsBTN = (Button) findViewById(R.id.selectMealsBTN);
        selectMealsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), selectMeals.class);
                startIntent.putExtra("com.example.diybottommenu.SOMETHING", "Select Meals");
                startActivity(startIntent);
            }
        });

        Button newMealBTN = (Button) findViewById(R.id.newMealBTN);
        newMealBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), newMeal.class);
                startIntent.putExtra("com.example.diybottommenu.SOMETHING", "Add new meal");
                startActivity(startIntent);
            }
        });

        Button dashboard = (Button) findViewById(R.id.dashboardBTN);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), dashboard.class);
                startIntent.putExtra("com.example.diybottommenu.SOMETHING", "Dashboard");
                startActivity(startIntent);
            }
        });

        Button settingsBTN = (Button) findViewById(R.id.settingsBTN);
        settingsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), settings.class);
                startIntent.putExtra("com.example.diybottommenu.SOMETHING", "Settings");
                startActivity(startIntent);
            }
        });
    }
}
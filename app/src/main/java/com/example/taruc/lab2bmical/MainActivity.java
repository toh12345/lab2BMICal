package com.example.taruc.lab2bmical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public EditText editTextWeight;
    public EditText editTextHeight;
    public static final String EXTRA_MESSAGE = "com.example.taruc.lab2bmical.BMI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWeight = findViewById(R.id.editTextWeight);

    }


    public void bmiCalculate(View view){
        double height, weight, bmi;

        if(TextUtils.isEmpty(editTextHeight.getText())){
            editTextHeight.setError("Please enter body height");
        }
        if(TextUtils.isEmpty(editTextWeight.getText())){
            editTextWeight.setError("Please enter body weight");
        }

        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        bmi = weight / (height * height);

        Intent intent = new Intent(this,highBMIActivity.class);
        intent.putExtra(EXTRA_MESSAGE,bmi);
        startActivity(intent);


    }
}

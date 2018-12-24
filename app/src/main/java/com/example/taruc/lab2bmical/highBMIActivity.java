package com.example.taruc.lab2bmical;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class highBMIActivity extends AppCompatActivity {

    private ImageView imageViewBMI;
    public TextView textViewBMI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_bmi);

        textViewBMI = findViewById(R.id.textViewBMI);
        imageViewBMI = findViewById(R.id.imageViewBMI);

        Intent intent = getIntent();
        //assign drawable to an image view

        double bmiValue = intent.getDoubleExtra("BMI",0);

            if (bmiValue<18.5){
                textViewBMI.setText("UnderWeight");
                imageViewBMI.setImageResource(R.drawable.under);

            }else if (bmiValue>=18.5 && bmiValue<=24.5){
                textViewBMI.setText("Moderate Weight");
                imageViewBMI.setImageResource(R.drawable.normal);

            }else{
                textViewBMI.setText("OverWeight");
                imageViewBMI.setImageResource(R.drawable.over);
            }




    }
    public void closeActivity(View view){
        finish();
    }
}

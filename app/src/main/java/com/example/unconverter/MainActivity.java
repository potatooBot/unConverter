  package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

  public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textview;
private EditText editText;
private ImageView imageView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextText);
        textview = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//
//
//                    String str = editText.getText().toString();
//                    int kg = Integer.parseInt(str);
//                if(kg==0 || kg<0)
//                    Toast.makeText(MainActivity.this, "Enter Correct Input", Toast.LENGTH_SHORT).show();
//
//
//                    double pound = kg * 2.20462d;
//                    String pattern = "#.##";
//                DecimalFormat  decimalFormat = new DecimalFormat(pattern);
//                        String formattDouble =decimalFormat.format(pound);
//                    textview.setText("The value of pound is : " +formattDouble);
//
//
//
//
//
//            }
//        });
    }


        public void calculate(View view){
            String str = editText.getText().toString();
                  int kg = Integer.parseInt(str);
            double pound = kg * 2.20462d;
                    String pattern = "#.##";
                DecimalFormat  decimalFormat = new DecimalFormat(pattern);
                        String formattDouble =decimalFormat.format(pound);
                    textview.setText("The value of pound is : " +formattDouble);

        }



    }

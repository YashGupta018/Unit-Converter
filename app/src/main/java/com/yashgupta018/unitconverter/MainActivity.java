package com.yashgupta018.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.convert);
        textView = findViewById(R.id.pounds);
        editText = findViewById(R.id.kg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String s = editText.getText().toString();
               int kg = Integer.parseInt(s);
               double pounds = 2.205 * kg;
               textView.setText(kg + " Kgs to Pounds is : " + pounds);

            }
        });

    }
}
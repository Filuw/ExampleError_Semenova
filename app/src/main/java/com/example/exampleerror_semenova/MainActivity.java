package com.example.exampleerror_semenova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView textview2 = (TextView) findViewById(R.id.tv_answer);
        EditText first = (EditText) findViewById(R.id.et_first);
        EditText second = (EditText) findViewById(R.id.et_second);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer firstInt = Integer.parseInt(first.getText().toString());
                    Integer secondInt = Integer.parseInt(second.getText().toString());

                    if (firstInt == secondInt){
                        textview2.setText("Равно");
                    }
                    else{
                        textview2.setText("Не равно");
                    }
                } catch (NumberFormatException e) {
                    textview2.setText("Ошибка");
                }
            }
        });
    }
}
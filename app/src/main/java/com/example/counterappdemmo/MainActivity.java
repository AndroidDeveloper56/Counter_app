package com.example.counterappdemmo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        textView=findViewById(R.id.counter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            textView.setText(""+coonterme());
            }
        });
    }
    public int coonterme(){
        return ++counter;
    }
}
package com.example.useofintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondForm extends AppCompatActivity {


    public TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_form);

        textview=findViewById(R.id.textviewsec);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bunde=getIntent().getExtras();
                if(bunde!=null)
                {
                   String message=bunde.getString("send");
                   textview.setText(message);
                }
            }
        });
    }
}
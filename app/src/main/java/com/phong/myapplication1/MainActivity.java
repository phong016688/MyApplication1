package com.phong.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.txtkq);
        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
               textView.setText(sum +"");
            }
        });*/
        //button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
        textView.setText(sum +"");
    }

    public void mClick(View view) {
        int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
        textView.setText(sum +"");
    }
}

package com.example.halloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView view;
    private Button button;
    private int i = 100;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        i--;
        String string;
        if (i == 0) {
            string = getResources().getString(R.string.layerTextResult);
            button.setVisibility(Button.INVISIBLE);
        } else {
            string = getResources().getString(R.string.layerText);
        }
        view.setText(String.format(string, i));

    }
}

package com.helloworld;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloWorld extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.hello_world_activity);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText("test");
    }
}

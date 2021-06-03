package com.nimrarani40.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button button;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.linear_layout );
         button= findViewById( R.id. button2);
        textView=findViewById( R.id.textView );
    }

    public void SomeOneISThere(View view) {
        textView.setText( "Some One New is there" );

    }
}
package com.sg.motion.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        count = 0;


        setContentView(R.layout.activity_main);
        text = findViewById(R.id.Textnumber);

    }

    public void CountUp(View view){
        count++;
        text.setText(String.valueOf(count));
    }

    public void ShowToast(View view){
        Toast t = Toast.makeText(this , text.getText() , Toast.LENGTH_LONG);
        t.show();
    }
}

package com.example.hafizhamza.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
public void Fade(View view)
{
    Log.i("info","Hello");
    Button b=(Button)findViewById(R.id.button3);
    b.animate().alpha(0).setDuration(2000);
}
    public void Fa(View view)
    {
        Log.i("info","Hello");
        ImageView b=(ImageView) findViewById(R.id.iImageView);
        b.animate().alpha(0).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

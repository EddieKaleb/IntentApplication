package com.example.eddie.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = new Intent();
        intent = getIntent();
        Bundle params = new Bundle();
        params = intent.getExtras();
        TextView txtView =(TextView)findViewById(R.id.txtView);
        String msg = params.getString("msg");
        txtView.setText(msg);
    }
}

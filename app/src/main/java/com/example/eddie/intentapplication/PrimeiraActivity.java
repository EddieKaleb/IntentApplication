package com.example.eddie.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PrimeiraActivity extends Activity {
    private Bundle params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
    }
    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onResume();
    }

    @Override
    protected void onStop(){
        super.onResume();
    }

    @Override
    protected void onDestroy(){
        super.onResume();
    }

    public void exibirMsg(View view){
        EditText txt = (EditText) findViewById(R.id.txt);
        Log.i("MensagemCapturada",txt.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(),txt.getText().toString(),Toast.LENGTH_LONG);
        toast.show();
        this.params = new Bundle();
        this.params.putString("msg",txt.getText().toString());
    }

    public void segundaActivity(View view){
        Intent segundaActivity = new Intent(this, SegundaActivity.class);
        segundaActivity.putExtras(this.params);
        startActivity(segundaActivity);
    }

}

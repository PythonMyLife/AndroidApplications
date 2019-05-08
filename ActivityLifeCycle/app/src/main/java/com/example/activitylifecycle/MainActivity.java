package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate");
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            Log.d(tag, tempData);
        }
        Button startNormal = findViewById(R.id.start_normal_activity);
        Button startDialog = findViewById(R.id.start_dialog_activity);
        startNormal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag,"onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d(tag, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key", tempData);
    }
}

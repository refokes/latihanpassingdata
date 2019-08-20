package com.example.latihanpassingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(MainActivity.this, MainMenu.class));
                }
            }
        });
        thread.start();;
    }
}
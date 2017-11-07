package com.robot_partner.morse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.robot_partner.morse.LedDemoActivity.COLOR_ID_RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = (EditText) findViewById(R.id.edit);
                String msg = input.getText().toString();
                String[] s_msg = msg.split("");
                Morse morse = new Morse();
                LedDemoActivity led = new LedDemoActivity();
                for (String aa : s_msg) {
                    if(aa.length()==0) continue;
                    int[] morseInt = morse.getMorseList(aa);
                    for(int i : morseInt)
                    {
                        if(i==0)
                        {
                            led.sendTsu(COLOR_ID_RED,MainActivity.this);
                        }else{

                            led.sendToh(COLOR_ID_RED,MainActivity.this);
                        }
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                        }
                        //Toast.makeText(MainActivity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

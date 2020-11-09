package com.example.a010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b_page();
    }
    public void back(View v){
        finish();
    }
    private void b_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            String mouth = bundle.getString("mouth");
            num = Integer.parseInt(bundle.getString("number"));
            TextView text = (TextView)findViewById(R.id.m);
            text.setText(mouth);


            if (num == 1){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2000" + "\n" + "2001" + "\n" + "2002" + "\n" + "2003" + "\n" + "2004");
            }
            else if (num == 2){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2100" + "\n" + "2101" + "\n" + "2102" + "\n" + "2103" + "\n" + "2104");
            }
            else if (num == 3){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2200" + "\n" + "2201" + "\n" + "2202" + "\n" + "2203" + "\n" + "2204");
            }
            else if (num == 4){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2300" + "\n" + "2301" + "\n" + "2302" + "\n" + "2303" + "\n" + "2304");
            }
            else if (num == 5){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2400" + "\n" + "2401" + "\n" + "2402" + "\n" + "2403" + "\n" + "2404");
            }
            else if (num == 6){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("2500" + "\n" + "2501" + "\n" + "2502" + "\n" + "2503" + "\n" + "2504");
            }
        }
    }
    public void BtoC(View v){
        EditText editText = (EditText)findViewById(R.id.editV1);
        Intent intent = new Intent(this, MainActivity3.class);
        Bundle bundle = new Bundle();
        bundle.putString("win", editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
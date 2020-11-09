package com.example.a010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        page();
    }
    public void month(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //上一頁
    public void number(View v){
        finish();
    }
    private void page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            num = Integer.parseInt(bundle.getString("win"));
            TextView textView = (TextView)findViewById(R.id.money);
            //中獎金額
            if (num == 2000){
                textView.setText("2000元");
            }
            else if (num == 2001){
                textView.setText("1000元");
            }
            else if (num == 2002){
                textView.setText("200元");
            }
            else if (num == 2003){
                textView.setText("200元");
            }
            else if (num == 2004){
                textView.setText("10元");
            }
            else if (num == 2100){
                textView.setText("2000元");
            }
            else if (num == 2101){
                textView.setText("1000元");
            }
            else if (num == 2102){
                textView.setText("200元");
            }
            else if (num == 2103){
                textView.setText("200元");
            }
            else if (num == 2104){
                textView.setText("10元");
            }
            else if (num == 2200){
                textView.setText("2000元");
            }
            else if (num == 2201){
                textView.setText("1000元");
            }
            else if (num == 2202){
                textView.setText("200元");
            }
            else if (num == 2203){
                textView.setText("200元");
            }
            else if (num == 2204){
                textView.setText("10元");
            }
            else if (num == 2300){
                textView.setText("2000元");
            }
            else if (num == 2301){
                textView.setText("1000元");
            }
            else if (num == 2302){
                textView.setText("200元");
            }
            else if (num == 2303){
                textView.setText("200元");
            }
            else if (num == 2304){
                textView.setText("10元");
            }
            else if (num == 2400){
                textView.setText("2000元");
            }
            else if (num == 2401){
                textView.setText("1000元");
            }
            else if (num == 2402){
                textView.setText("200元");
            }
            else if (num == 2403){
                textView.setText("200元");
            }
            else if (num == 2404){
                textView.setText("10元");
            }
            else if (num == 2500){
                textView.setText("2000元");
            }
            else if (num == 2501){
                textView.setText("1000元");
            }
            else if (num == 2502){
                textView.setText("200元");
            }
            else if (num == 2503){
                textView.setText("200元");
            }
            else if (num == 2504){
                textView.setText("10元");
            }
            else
                textView.setText("再接再厲!");
        }
    }
}
package com.example.a010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1B = (Button)findViewById(R.id.button);
        btn1B.setOnClickListener(btn1B0);

        Button btn2B = (Button)findViewById(R.id.button2);
        btn2B.setOnClickListener(btn2B0);

        Button btn3B = (Button)findViewById(R.id.button3);
        btn3B.setOnClickListener(btn3B0);

        Button btn4B = (Button)findViewById(R.id.button4);
        btn4B.setOnClickListener(btn4B0);

        Button btn5B = (Button)findViewById(R.id.button5);
        btn5B.setOnClickListener(btn5B0);

        Button btn6B = (Button)findViewById(R.id.button6);
        btn6B.setOnClickListener(btn6B0);
    }
    private View.OnClickListener btn1B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("1");
            text.setText("2020 1,2月發票");

        }
    };
    private View.OnClickListener btn2B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("2");
            text_2.setText("2020 3,4月發票");

        }
    };
    private View.OnClickListener btn3B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("3");
            text_3.setText("2020 5,6月發票");

        }
    };
    private View.OnClickListener btn4B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("4");
            text_4.setText("2020 7,8月發票");

        }
    };
    private View.OnClickListener btn5B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("5");
            text_5.setText("2020 9,10月發票");

        }
    };
    private View.OnClickListener btn6B0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.click);
            TextView set = (TextView)findViewById(R.id.textView7);
            set.setText("6");
            text_6.setText("2020 11,12月發票");

        }
    };
    public void AtoB(View v){

        TextView click_btn = (TextView)findViewById(R.id.click);
        TextView set= (TextView)findViewById(R.id.textView7);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", click_btn.getText().toString());
        bundle.putString("number", set.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
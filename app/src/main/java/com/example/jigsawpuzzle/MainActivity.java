package com.example.jigsawpuzzle;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    public int count=0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer ring =MediaPlayer.create(MainActivity.this,R.raw.joe);
        ring.start();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#DC143C"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


        final ArrayList numbers=new ArrayList();
        for (int i=0;i<8;i++)
        {
            numbers.add(i+1);
        }
        Collections.shuffle(numbers);



        final Button button1=(Button)findViewById(R.id.button1);
        final Button button2=(Button)findViewById(R.id.button2);
        final Button button3=(Button)findViewById(R.id.button3);
        final Button button4=(Button)findViewById(R.id.button4);
        final Button button5=(Button)findViewById(R.id.button5);
        final Button button6=(Button)findViewById(R.id.button6);
        final Button button7=(Button)findViewById(R.id.button7);
        final Button button8=(Button)findViewById(R.id.button8);
        final Button button9=(Button)findViewById(R.id.button9);
        final Button reset=(Button)findViewById(R.id.Reset);
        final TextView textView=(TextView)findViewById(R.id.textView2);
        final TextView textView2=(TextView)findViewById(R.id.Win);


        button1.setText(numbers.get(0).toString());
        button2.setText(numbers.get(1).toString());
        button3.setText(numbers.get(2).toString());
        button4.setText(numbers.get(3).toString());
        button5.setText(numbers.get(4).toString());
        button6.setText(numbers.get(5).toString());
        button7.setText(numbers.get(6).toString());
        button8.setText(numbers.get(7).toString());






        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.equals(button1))
                {
                    if (button2.getText()=="")
                    {
                        button2.setText(button1.getText());
                        button1.setText("");
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));

                    }
                    else if (button4.getText()=="")
                    {
                        button4.setText(button1.getText());
                        button1.setText("");
                        button1.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button2))
                {
                    if (button1.getText()=="")
                    {
                        button1.setText(button2.getText());
                        button2.setText("");
                        button2.setVisibility(View.INVISIBLE);
                        button1.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button3.getText()=="")
                    {
                        button3.setText(button2.getText());
                        button2.setText("");
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button5.getText()=="")
                    {
                        button5.setText(button2.getText());
                        button2.setText("");
                        button2.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button3))
                {
                    if (button2.getText()=="")
                    {
                        button2.setText(button3.getText());
                        button3.setText("");
                        button3.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button6.getText()=="")
                    {
                        button6.setText(button3.getText());
                        button3.setText("");
                        button3.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button4))
                {
                    if (button1.getText()=="")
                    {
                        button1.setText(button4.getText());
                        button4.setText("");
                        button4.setVisibility(View.INVISIBLE);
                        button1.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button5.getText()=="")
                    {
                        button5.setText(button4.getText());
                        button4.setText("");
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button7.getText()=="")
                    {
                        button7.setText(button4.getText());
                        button4.setText("");
                        button4.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button5))
                {
                    if (button2.getText()=="")
                    {
                        button2.setText(button5.getText());
                        button5.setText("");
                        button5.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button4.getText()=="")
                    {
                        button4.setText(button5.getText());
                        button5.setText("");
                        button5.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button6.getText()=="")
                    {
                        button6.setText(button5.getText());
                        button5.setText("");
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button8.getText()=="")
                    {
                        button8.setText(button5.getText());
                        button5.setText("");
                        button5.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button6))
                {
                    if (button3.getText()=="")
                    {
                        button3.setText(button6.getText());
                        button6.setText("");
                        button6.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button5.getText()=="")
                    {
                        button5.setText(button6.getText());
                        button6.setText("");
                        button6.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button9.getText()=="")
                    {
                        button9.setText(button6.getText());
                        button6.setText("");
                        button6.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button7))
                {
                    if (button4.getText()=="")
                    {
                        button4.setText(button7.getText());
                        button7.setText("");
                        button7.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button8.getText()=="")
                    {
                        button8.setText(button7.getText());
                        button7.setText("");
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button8))
                {
                    if (button7.getText()=="")
                    {
                        button7.setText(button8.getText());
                        button8.setText("");
                        button8.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button5.getText()=="")
                    {
                        button5.setText(button8.getText());
                        button8.setText("");
                        button8.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button9.getText()=="")
                    {
                        button9.setText(button8.getText());
                        button8.setText("");
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if (view.equals(button9))
                {
                    if (button6.getText()=="")
                    {
                        button6.setText(button9.getText());
                        button9.setText("");
                        button9.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                    else if (button8.getText()=="")
                    {
                        button8.setText(button9.getText());
                        button9.setText("");
                        button9.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.VISIBLE);
                        textView.setText(String.valueOf(++count));
                    }
                }
                if(view.equals((reset)))
                {
                    count=0;
                    textView.setText(String.valueOf(count));
                    Collections.shuffle(numbers);
                    button1.setText(numbers.get(0).toString());
                    button2.setText(numbers.get(1).toString());
                    button3.setText(numbers.get(2).toString());
                    button4.setText(numbers.get(3).toString());
                    button5.setText(numbers.get(4).toString());
                    button6.setText(numbers.get(5).toString());
                    button7.setText(numbers.get(6).toString());
                    button8.setText(numbers.get(7).toString());
                    button9.setText("");
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                    button5.setVisibility(View.VISIBLE);
                    button6.setVisibility(View.VISIBLE);
                    button7.setVisibility(View.VISIBLE);
                    button8.setVisibility(View.VISIBLE);
                    button9.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.INVISIBLE);

                }
                if (button1.getText()=="1" && button2.getText()=="2" && button3.getText()=="3" && button4.getText()=="4" && button5.getText()=="5" && button6.getText()=="6" && button7.getText()=="7" && button8.getText()=="8" )
                {
                    textView2.setVisibility(View.VISIBLE);
                }
        }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        reset.setOnClickListener(listener);


    }

}

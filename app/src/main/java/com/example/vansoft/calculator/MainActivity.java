package com.example.vansoft.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



    public class MainActivity extends AppCompatActivity {
        //TextView textView1;
        EditText Edittext;
        float mValueOne, mValueTwo;//copied code
        boolean mAddition, mSubtract, mMultiplication, mDivision;//copied code


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button1 =(Button)findViewById(R.id.button1);
            Button button2 = (Button)findViewById(R.id.button2);
            Button button3 = (Button)findViewById(R.id.button3);
            Button button4 =(Button) findViewById(R.id.button4);
            Button button5 = (Button)findViewById(R.id.button5);
            Button button6 = (Button)findViewById(R.id.button6);
            Button button7 =(Button) findViewById(R.id.button7);
            Button button8 = (Button)findViewById(R.id.button8);
            Button button9 =(Button) findViewById(R.id.button9);
            Button button0 = findViewById(R.id.button0);
            Button buttonplu =(Button) findViewById(R.id.buttonplus);
            Button buttonminu = (Button)findViewById(R.id.buttonminus);
            Button buttmul =(Button) findViewById(R.id.multi);
            Button buttdot = (Button)findViewById(R.id.dot);
            Button buttequals = (Button)findViewById(R.id.equals);
            Edittext = (EditText) findViewById(R.id.Edittext);


            Button butdiv =(Button) findViewById(R.id.divide);



            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "1");

                }

            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "2");

                }


            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "3");

                }


            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "4");


                }


            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "5");


                }


            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "6");


                }


            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "7");


                }


            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "8");


                }


            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + "9");


                }


            });
            button0.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View view) {
             Edittext.setText(Edittext.getText() + "0");


            }


            });
            buttonplu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (Edittext == null) { //copied code
                        Edittext.setText("");
                    } else {
                        mValueOne = Float.parseFloat(Edittext.getText() + " ");
                        mAddition = true;
                        Edittext.setText(null);
                    }
                }
            });


            buttonminu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mValueOne = Float.parseFloat(Edittext.getText() + " ");
                    mSubtract = true;
                    Edittext.setText(null);


                }


            });
            buttmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mValueOne = Float.parseFloat(Edittext.getText() + " ");
                    mMultiplication = true;
                    Edittext.setText(null);


                }


            });
            butdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mValueOne = Float.parseFloat(Edittext.getText() + " ");
                    mDivision = true;
                    Edittext.setText(null);


                }


            });
            buttdot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Edittext.setText(Edittext.getText() + ".");


                }


            });

            buttequals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mValueTwo = Float.parseFloat(Edittext.getText() + "");

                    if (mAddition == true) {

                        Edittext.setText(mValueOne + mValueTwo + " ");
                        mAddition = false;
                    }


                    if (mSubtract == true) {
                        Edittext.setText(mValueOne - mValueTwo + " ");
                        mSubtract = false;
                    }

                    if (mMultiplication == true) {
                        Edittext.setText(mValueOne * mValueTwo + " ");
                        mMultiplication = false;
                    }

                    if (mDivision == true) {
                        Edittext.setText(mValueOne / mValueTwo + " ");
                        mDivision = false;
                    }
                }
            });
        }

    }
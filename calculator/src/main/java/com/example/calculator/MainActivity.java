package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot, btne, btnd, btnm, btns, btna;
    TextView cal_txtv;
    double var1, var2;
    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndot = (Button) findViewById(R.id.btndot);
        btne = (Button) findViewById(R.id.btne);
        btnd = (Button) findViewById(R.id.btnd);
        btnm = (Button) findViewById(R.id.btnm);
        btns = (Button) findViewById(R.id.btns);
        btna = (Button) findViewById(R.id.btna);

        cal_txtv = (TextView) findViewById(R.id.cal_txtv);

        //for zero
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "0");
            }
        });

        //for click on one
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "1");
            }
        });


        //for  2
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        cal_txtv.setText(cal_txtv.getText() + "2");
                                    }
                                }
        );
        //for 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "3");
            }
        });
        //for 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "4");
            }
        });
        //for 5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "5");
            }
        });
        //for 6

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "6");
            }
        });

        //for 7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "7");
            }
        });

        //for 8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "8");
            }
        });
        //for 9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + "9");
            }
        });

        //for dot

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_txtv.setText(cal_txtv.getText() + ".");
            }
        });

        //for /

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(cal_txtv.getText() + " ");
                division = true;
                cal_txtv.setText(null);
            }
        });

        //for*
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(cal_txtv.getText() + " ");
                multiplication = true;
                cal_txtv.setText(null);
            }
        });

        //for -

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(cal_txtv.getText() + " ");
                subtraction = true;
                cal_txtv.setText(null);
            }
        });
        //for +

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(cal_txtv.getText() + " ");
                addition = true;
                cal_txtv.setText(null);
            }
        });
        // for =
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(cal_txtv.getText() + " ");

                if (addition == true) {
                    cal_txtv.setText(var1 + var2 + "");
                    addition = false;
                }

                if (subtraction == true) {
                    cal_txtv.setText(var1 - var2 + "");
                    subtraction = false;
                }
                if (multiplication == true) {
                    cal_txtv.setText(var1 * var2 + "");
                    multiplication = false;
                }
                if (division == true) {
                    cal_txtv.setText(var1 / var2 + "");
                    division = false;
                }


            }
        });


    }
}


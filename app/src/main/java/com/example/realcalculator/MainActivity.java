package com.example.realcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Zero2,Decimal,Equal,Add,Subs,Mul,Div,Clear,Delete,Percent;
    TextView DisplayL, DisplayU , Operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayL = findViewById(R.id.tvLowerDisplay);
        DisplayU = findViewById(R.id.tvUpperDisplay);
        Operator = findViewById(R.id.tvAction);
        One = findViewById(R.id.btnOne);
        Two = findViewById(R.id.btnTwo);
        Three= findViewById(R.id.btnThree);
        Four= findViewById(R.id.btnFour);
        Five= findViewById(R.id.btnFive);
        Six= findViewById(R.id.btnSix);
        Seven= findViewById(R.id.btnSeven);
        Eight= findViewById(R.id.btnEight);
        Nine= findViewById(R.id.btnNine);
        Zero= findViewById(R.id.btnZero);
        Zero2= findViewById(R.id.btnDoubleZero);
        Decimal= findViewById(R.id.btnDecimal);
        Equal= findViewById(R.id.btnEqual);
        Add= findViewById(R.id.btnAdd);
        Subs= findViewById(R.id.btnSubtract);
        Mul= findViewById(R.id.btnMultiply);
        Div= findViewById(R.id.btnDivide);
        Clear= findViewById(R.id.btnClear);
        Delete= findViewById(R.id.btnBackspace);
        Percent= findViewById(R.id.btnPrecentage);

        int Num1,Num2,Ans;

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"1");
            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"2");
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"3");
            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"4");
            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"5");
            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"6");
            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"7");
            }
        });
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"8");
            }
        });
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"9");
            }
        });
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"0");
            }
        });
        Zero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+"00");
            }
        });
        Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(DisplayL.getText()+".");
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayU.setText(""+DisplayL.getText());
                Operator.setText("+");
                DisplayL.setText(null);
            }
        });
        Subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayU.setText(""+DisplayL.getText());
                Operator.setText("-");
                DisplayL.setText(null);
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayU.setText(""+DisplayL.getText());
                Operator.setText("*");
                DisplayL.setText(null);
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayU.setText(""+DisplayL.getText());
                Operator.setText("/");
                DisplayL.setText(null);
            }
        });
        Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayU.setText(""+DisplayL.getText());
                Operator.setText("%");
                DisplayL.setText(null);
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Integer.parseInt(DisplayU.getText().toString());
                float num2 = Integer.parseInt(DisplayL.getText().toString());
                char ch = Operator.getText().toString().charAt(0);
                switch (ch)
                {
                    case '+':
                        DisplayU.setText(DisplayU.getText()+""+Operator.getText()+""+DisplayL.getText());
                        Operator.setText(null);
                        DisplayL.setText(""+(num1+num2));
                        break;
                    case '-':
                        DisplayU.setText(DisplayU.getText()+""+Operator.getText()+""+DisplayL.getText());
                        Operator.setText(null);
                        DisplayL.setText(""+(num1-num2));
                        break;
                    case '*':
                        DisplayU.setText(DisplayU.getText()+""+Operator.getText()+""+DisplayL.getText());
                        Operator.setText(null);
                        DisplayL.setText(""+(num1*num2));
                        break;
                    case '/':
                        DisplayU.setText(DisplayU.getText()+""+Operator.getText()+""+DisplayL.getText());
                        Operator.setText(null);
                        DisplayL.setText(""+(num1/num2));
                        break;
                    case '%':
                        DisplayU.setText(DisplayU.getText()+""+Operator.getText()+""+DisplayL.getText());
                        Operator.setText(null);
                        DisplayL.setText(""+(num1/100)*num2);
                        break;
                }
            }
        });


        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayL.setText(null);
                DisplayU.setText(null);
                Operator.setText(null);
            }
        });

    }
}
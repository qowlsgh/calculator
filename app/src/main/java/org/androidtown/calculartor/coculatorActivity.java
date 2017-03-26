package org.androidtown.calculartor;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Objects;

public class coculatorActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList arrayList = new ArrayList();
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_eq,btn_slash,btn_minus,
            btn_pls,btn_dot,btn_clr,btnx;
    TextView entry_bar;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coculator);


        /*
        Button a =(Button)findViewById(R.id.btn1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "asdf", Toast.LENGTH_SHORT).show();
            }
        });*/


        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btn_eq=(Button)findViewById(R.id.btn_eq);
        btn_dot=(Button)findViewById(R.id.btn_dot);
        btn_slash=(Button)findViewById(R.id.btn_slash);
        btn_minus=(Button)findViewById(R.id.btn_minus);
        btn_pls=(Button)findViewById(R.id.btn_pls);
        btn_clr=(Button)findViewById(R.id.btn_clr);
        btnx=(Button)findViewById(R.id.btnx);
        entry_bar=(TextView)findViewById(R.id.text_view);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn_eq.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_slash.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btnx.setOnClickListener(this);
        btn_pls.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        entry_bar.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_clr:


                arrayList.clear();

                entry_bar.setText("");
                break;
            case R.id.btn0:
                entry_bar.setText(entry_bar.getText().toString()+"0");
                break;
            case R.id.btn1:
                entry_bar.setText(entry_bar.getText().toString()+"1");
            case R.id.btn2:
                entry_bar.setText(entry_bar.getText().toString()+"2");
            case R.id.btn3:
                entry_bar.setText(entry_bar.getText().toString()+"3");
            case R.id.btn4:
                entry_bar.setText(entry_bar.getText().toString()+"4");
            case R.id.btn5:
                entry_bar.setText(entry_bar.getText().toString()+"5");
            case R.id.btn6:
                entry_bar.setText(entry_bar.getText().toString()+"6");
            case R.id.btn7:
                entry_bar.setText(entry_bar.getText().toString()+"7");
            case R.id.btn8:
                entry_bar.setText(entry_bar.getText().toString()+"8");
            case R.id.btn9:
                entry_bar.setText(entry_bar.getText().toString()+"9");
            case R.id.btn_pls:
                arrayList.add(entry_bar.getText().toString());
                entry_bar.setText("");
                count = 1;
                break;
            case R.id.btn_minus:
                arrayList.add(entry_bar.getText().toString());
                entry_bar.setText("");
                count = 2;
                break;
            case R.id.btnx:
                arrayList.add(entry_bar.getText().toString());
                entry_bar.setText("");
                count = 3;
                break;
            case R.id.btn_slash:
                arrayList.add(entry_bar.getText().toString());
                entry_bar.setText("");
                count = 4;
                break;
            case R.id.btn_eq:
                int sum1=0, sum2=0, sum3,count2 =0;
                double fsum1=0, fsum2=0, fsum3=0;

                if(arrayList.isEmpty()) {

                    entry_bar.setText("");
                } else{
                    Object obj = arrayList.get(0);
                  String num1 = (String)obj;
                    String num2 = entry_bar.getText().toString();
                if (num1.contains(".")) (num2.contains(".")){
                        count2 = 1;
                        fsum1 = Float.parseFloat(num1);


                    }

                }



        }
    }
}

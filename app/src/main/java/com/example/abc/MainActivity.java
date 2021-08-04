package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue, etsecondValue, sqt,ff,fs,ft,sf,ss,st,tf,ts,tt;
    TextView tvAns;
    Button buAdd, buSubtract, buMultiply, buDivide, bupower , busqrt , checkprime , cbrt,rem,hcf,lcm,factorial,permu, combu,detr
            ,detrm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ff = findViewById(R.id.ff);
//        fs = findViewById(R.id.fs);
//        ft = findViewById(R.id.ft);
//        sf = findViewById(R.id.sf);
//        ss = findViewById(R.id.ss);
//        st = findViewById(R.id.st);
//        tf = findViewById(R.id.tf);
//        ts = findViewById(R.id.ts);
//        tt = findViewById(R.id.tt);

        etsecondValue = findViewById(R.id.etSecondvalue);
        etfirstvalue=findViewById(R.id.etfirstvalue);
        tvAns = findViewById(R.id.tvAns);
        buAdd = findViewById(R.id.buAdd);
        buSubtract = findViewById(R.id.buSubtract);
      //  detr = findViewById(R.id.dete);
        permu=findViewById(R.id.permu);
        combu=findViewById(R.id.combu);
        buMultiply = findViewById(R.id.buMultiply);
        buDivide = findViewById(R.id.buDivide);
        bupower = findViewById(R.id.bupower);
        factorial=findViewById(R.id.factorial);
      //  detrm=findViewById(R.id.detem);
        rem=findViewById(R.id.rem);
        hcf=findViewById(R.id.hcf);
        lcm=findViewById(R.id.lcm);
        cbrt=findViewById(R.id.cbrt);
        sqt = findViewById(R.id.sqt);
        busqrt = findViewById(R.id.busqrt);
        checkprime = findViewById(R.id.checkprime);
        buAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Double.parseDouble(etfirstvalue.getText().toString());
                secondvalue = Double.parseDouble(etsecondValue.getText().toString());
                Ans = firstvalue + secondvalue;
                tvAns.setText("ans is = " + Ans);
            }
        });
//        detr.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double fff, ffs,fft,ssf,sss,sst,ttf,tts,ttt, Ans;
////                String fs=etfirstvalue.getText().toString();
////                String ss=etsecondValue.getText().toString();
////                if(fs.length()==0 || ss.length()==0){
////                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
////                    return;
////
////                }
//                fff = Double.parseDouble(ff.getText().toString());
//                ffs= Double.parseDouble(fs.getText().toString());
//                fft= Double.parseDouble(ft.getText().toString());
//                ssf= Double.parseDouble(sf.getText().toString());
//                sss= Double.parseDouble(ss.getText().toString());
//                sst= Double.parseDouble(st.getText().toString());
//                ttf= Double.parseDouble(tf.getText().toString());
//                tts= Double.parseDouble(ts.getText().toString());
//                ttt= Double.parseDouble(tt.getText().toString());
//                Ans=fff*(sss*ttt-sst*tts)-ffs*(ssf*ttt-sst*ttf)+fft*(ssf*tts-sss*ttf);
//
//                //     Ans = firstvalue + secondvalue;
//                tvAns.setText("ans is = " + Ans);
//            }
//        });
//        detrm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double fff, ffs,fft,ssf,sss,sst,ttf,tts,ttt, Ans;
////                String fs=etfirstvalue.getText().toString();
////                String ss=etsecondValue.getText().toString();
////                if(fs.length()==0 || ss.length()==0){
////                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
////                    return;
////
////                }
//                fff = Double.parseDouble(ff.getText().toString());
//                ffs= Double.parseDouble(fs.getText().toString());
//               // fft= Double.parseDouble(ft.getText().toString());
//                ssf= Double.parseDouble(sf.getText().toString());
//                sss= Double.parseDouble(ss.getText().toString());
////                sst= Double.parseDouble(st.getText().toString());
////                ttf= Double.parseDouble(tf.getText().toString());
////                tts= Double.parseDouble(ts.getText().toString());
////                ttt= Double.parseDouble(tt.getText().toString());
//                Ans=fff*sss-ffs*ssf;
//
//                //     Ans = firstvalue + secondvalue;
//                tvAns.setText("ans is = " + Ans);
//            }
//        });
        permu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
                BigInteger g = new BigInteger("1"); // Or BigInteger.ONE

                // Multiply f with 2, 3, ...N
                for (int i = 2; i <= firstvalue; i++){
                    f = f.multiply(BigInteger.valueOf(i));
                }
                for (int i = 2; i <= secondvalue; i++){
                    g = g.multiply(BigInteger.valueOf(i));
                }

                tvAns.setText("ans is = "+f.divide(g));
            }
        });
        combu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
                BigInteger g = new BigInteger("1"); // Or BigInteger.ONE
                BigInteger h = new BigInteger("1"); // Or BigInteger.ONE

                // Multiply f with 2, 3, ...N
                for (int i = 2; i <= firstvalue; i++){
                    f = f.multiply(BigInteger.valueOf(i));
                }
                for (int i = 2; i <= secondvalue; i++){
                    g = g.multiply(BigInteger.valueOf(i));
                }
                for (int i = 2; i <=firstvalue-secondvalue; i++){
                    h = h.multiply(BigInteger.valueOf(i));
                }
                BigInteger k=f.divide(g);

                tvAns.setText("ans is = "+k.divide(h));
            }
        });
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Long.parseLong(etfirstvalue.getText().toString());
                secondvalue = Long.parseLong(etsecondValue.getText().toString());
                Ans = firstvalue % secondvalue;
                tvAns.setText("ans is = " + Ans);
            }
        });
        hcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Long.parseLong(etfirstvalue.getText().toString());
                secondvalue = Long.parseLong(etsecondValue.getText().toString());
                if(firstvalue ==0 && secondvalue !=0){
                    Ans=secondvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue !=0 && secondvalue ==0){
                    Ans=firstvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue ==0 && secondvalue ==0){
                    Ans=secondvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue !=0 && secondvalue !=0){
                    long ee=firstvalue;
                    long kk=secondvalue;
                    if(firstvalue>=secondvalue){
                        while (secondvalue!=0){
                           secondvalue=firstvalue%secondvalue;
                           firstvalue=kk;
                           kk=secondvalue;
                        }
                        Ans=firstvalue;
                        tvAns.setText("Ans is= "+Ans);

                    }
                    if(firstvalue<secondvalue){
                        while(firstvalue!=0){
                            firstvalue=secondvalue%firstvalue;
                            secondvalue=ee;
                            ee=firstvalue;
                        }
                        Ans=secondvalue;
                        tvAns.setText("Ans is= "+Ans);

                    }
                }

            }
        });
        lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Long.parseLong(etfirstvalue.getText().toString());
                secondvalue = Long.parseLong(etsecondValue.getText().toString());
                long aaa=firstvalue;
                long bbb=secondvalue;
                if(firstvalue ==0 && secondvalue !=0){
                    Ans=firstvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue !=0 && secondvalue ==0){
                    Ans=secondvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue ==0 && secondvalue ==0){
                    Ans=secondvalue;
                    tvAns.setText("Ans is= "+Ans);
                }
                if(firstvalue !=0 && secondvalue !=0){
                    long ee=firstvalue;
                    long kk=secondvalue;
                    if(firstvalue>=secondvalue){
                        while (secondvalue!=0){
                            secondvalue=firstvalue%secondvalue;
                            firstvalue=kk;
                            kk=secondvalue;
                        }
                        Ans=(aaa*bbb)/firstvalue;
                        tvAns.setText("Ans is= "+Ans);

                    }
                    if(firstvalue<secondvalue){
                        while(firstvalue!=0){
                            firstvalue=secondvalue%firstvalue;
                            secondvalue=ee;
                            ee=firstvalue;
                        }
                        Ans=(aaa*bbb)/secondvalue;
                        tvAns.setText("Ans is= "+Ans);

                    }
                }

            }
        });


        buSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Double.parseDouble(etfirstvalue.getText().toString());
                secondvalue = Double.parseDouble(etsecondValue.getText().toString());
                Ans = firstvalue - secondvalue;
                tvAns.setText("ans is = " + Ans);
            }
        });
        buMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Double.parseDouble(etfirstvalue.getText().toString());
                secondvalue = Double.parseDouble(etsecondValue.getText().toString());
                Ans = firstvalue * secondvalue;
                tvAns.setText("ans is =  " + Ans);
            }

        });
        buDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }

                firstvalue = Double.parseDouble(etfirstvalue.getText().toString());
                secondvalue = Double.parseDouble(etsecondValue.getText().toString());
                Ans = firstvalue / secondvalue;
                tvAns.setText("ans is = " + Ans);
            }
        });


        bupower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, Ans;
                String fs=etfirstvalue.getText().toString();
                String ss=etsecondValue.getText().toString();
                if(fs.length()==0 || ss.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter valid numbers",Toast.LENGTH_SHORT).show();
                    return;

                }
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                int c = firstvalue;
                int k = 1;
                while (k < secondvalue) {
                    c = c * firstvalue;
                    k++;
                }
                tvAns.setText("ans is = " + c);
            }
        });


        busqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double secondvalue, Ans;
                String valstr = sqt.getText().toString();
                if(valstr.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                secondvalue = Double.parseDouble(sqt.getText().toString());
                double c = Math.sqrt(secondvalue);

                tvAns.setText("ans is = " + c);
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int secondvalue, Ans;
                String valstr = sqt.getText().toString();
                if(valstr.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                secondvalue = Integer.parseInt(sqt.getText().toString());
                BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

                // Multiply f with 2, 3, ...N
                for (int i = 2; i <= secondvalue; i++){
                    f = f.multiply(BigInteger.valueOf(i));
                }


                tvAns.setText("ans is = " + f);
            }
        });


        checkprime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int secondvalue, Ans;

                String valstr = sqt.getText().toString();
                if(valstr.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }

                secondvalue = Integer.parseInt(sqt.getText().toString());
               boolean isprime=true;
               for (int i=2;i<secondvalue;i++){
                   if (secondvalue%i==0){
                       isprime=false;
                       break;
                   }
               }
               if (secondvalue==1){
                   isprime=false;
               }
                if (isprime) {

                    tvAns.setText("Yes");
                }else{
                    tvAns.setText("No");
                }


                cbrt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double secondvalue, Ans;
                        String valstr = sqt.getText().toString();
                        if(valstr.length()==0){
                            Toast.makeText(getApplicationContext(),"Enter a number",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        secondvalue = Double.parseDouble(sqt.getText().toString());
                        double c = Math.cbrt(secondvalue);

                        tvAns.setText("ans is = " + c);
                    }
                });



















            }
        });
















    }}
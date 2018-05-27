package com.example.dell.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity{


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2main);


        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        String tim =dateFormat .format(new Date());
        String[] hr=tim.split(":");
        String s1="";
        String zero="0";
        //Toast.makeText(getBaseContext(), hr1, Toast.LENGTH_SHORT).show();
        if (hr[1].charAt(0)==zero.charAt(0)){
            String hr1 = hr[1].substring(1);
            int min=Integer.parseInt(hr[1]);
            if (hr[0].charAt(0)==zero.charAt(0)){
            String hr0 = hr[0].substring(1);
            int hour=Integer.parseInt(hr0);
            if((hour==7&& min<=15)||(hour<7))
        {
                s1= "07:15 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.pr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Palaj");

        }
            else if((hour==07&& min>15)||(hour==8 &&min<=15))
        {
            s1= "08:15 AM";
            TextView time=(TextView) findViewById(R.id.time);
            time.setText(s1);
            ImageView i1=(ImageView) findViewById(R.id.route);
            i1.setImageResource(R.drawable.direct);
            TextView place =(TextView) findViewById(R.id.place);
            place.setText("To Chandkheda");
        }   else if((hour==8&& min>15)||(hour==9&& min==00))
        {
            s1= "09:00 AM";
            TextView time=(TextView) findViewById(R.id.time);
            time.setText(s1);
            ImageView i1=(ImageView) findViewById(R.id.route);
            i1.setImageResource(R.drawable.pr);
            TextView place =(TextView) findViewById(R.id.place);
            place.setText("To Palaj");

        }   else if((hour==9&& min>00))
            {
                s1= "10:00 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Rakshashakti");

            }
            }
            else{
                int hour=Integer.parseInt(hr[0]);
                if ((hour==22&& min>30)||(hour>=23)){
                    s1= "07:15 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
            else if((hour==10&& min==00))
            {
                s1= "10:00 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Rakshashakti");

            }
            else if((hour==10&& 30>min&& min>00)||(hour==10&& min==30))
            {
                s1= "10:30 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Palaj");

            }
            else if((hour==10&& min>30)||(hour==11&& min==00))
            {
                s1= "11:00 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Rakshashakti");

            }
            else if((hour==11&& min<30 && min>00)||(hour==11&& min==30))
            {
                s1= "11:30 AM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Palaj");

            }
            else if((hour==11&& min>30)||(hour==12&& min==00))
            {
                s1= "12:00 PM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Rakshashakti");

            }
            else if((hour==12&& min<30 && min>00)||(hour==12&& min==30))
            {
                s1= "12:30 PM";
                TextView time=(TextView) findViewById(R.id.time);
                time.setText(s1);
                ImageView i1=(ImageView) findViewById(R.id.route);
                i1.setImageResource(R.drawable.rr);
                TextView place =(TextView) findViewById(R.id.place);
                place.setText("To Palaj");
            }
                else if((hour==12&& min>30)||(hour>12&& hour<17)||(hour==17&& min<=15))
                {
                    s1= "5:15 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==17&& min>15)||(hour==18&& min==00))
                {
                    s1= "6:00 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==18&& min<45 && min>00)||(hour==18&& min==45))
                {
                    s1= "6:45 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==18&& min>45)||(hour==19&& min<=30))
                {
                    s1= "7:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==19&& min>30)||(hour==20&& min<=30))
                {
                    s1= "8:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==20&& min>30)||(hour>20&& hour<22)||(hour==22&&min<=30))
                {
                    s1= "10:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
            }
        }else{
            int min=Integer.parseInt(hr[1]);
            if (hr[0].charAt(0)==zero.charAt(0)){
                String hr0 = hr[0].substring(1);
                int hour=Integer.parseInt(hr0);
                if((hour==7&& min<=15)||(hour<7))
                {
                    s1= "07:15 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");

                }
                else if((hour==07&& min>15)||(hour==8 &&min<=15))
                {
                    s1= "08:15 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }   else if((hour==8&& min>15)||(hour==9&& min==00))
                {
                    s1= "09:00 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");

                }   else if((hour==9&& min>00))
                {
                    s1= "10:00 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Rakshashakti");

                }
            }
            else{
                int hour=Integer.parseInt(hr[0]);
                if ((hour==22&& min>30)||(hour>=23)){
                    s1= "07:15 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==10&& min==00))
                {
                    s1= "10:00 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Rakshashakti");

                }
                else if((hour==10&& min<30 && min>00)||(hour==10&& min==30))
                {
                    s1= "10:30 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");

                }
                else if((hour==10&& min>30)||(hour==11&& min==00))
                {
                    s1= "11:00 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Rakshashakti");

                }
                else if((hour==11&& min<30&& min>00)||(hour==11&& min==30))
                {
                    s1= "11:30 AM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");

                }
                else if((hour==11&& min>30)||(hour==12&& min==00))
                {
                    s1= "12:00 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Rakshashakti");

                }
                else if((hour==12&& min<30 && min>00)||(hour==12&& min==30))
                {
                    s1= "12:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.rr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==12&& min>30)||(hour>12&& hour<17)||(hour==17&& min<=15))
                {
                    s1= "5:15 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==17&& min>15)||(hour==18&& min==00))
                {
                    s1= "6:00 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==18&& min<45 && min>00)||(hour==18&& min==45))
                {
                    s1= "6:45 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==18&& min>45)||(hour==19&& min<=30))
                {
                    s1= "7:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.direct);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
                else if((hour==19&& min>30)||(hour==20&& min<=30))
                {
                    s1= "8:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Chandkheda");
                }
                else if((hour==20&& min>30)||(hour>20&& hour<22)||(hour==22&&min<=30))
                {
                    s1= "10:30 PM";
                    TextView time=(TextView) findViewById(R.id.time);
                    time.setText(s1);
                    ImageView i1=(ImageView) findViewById(R.id.route);
                    i1.setImageResource(R.drawable.pr);
                    TextView place =(TextView) findViewById(R.id.place);
                    place.setText("To Palaj");
                }
            }

        }

    }


}
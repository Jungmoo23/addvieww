package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ArrayList l1,l2;
    View view;

    LinearLayoutCompat linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = sendList();
        l2= secondeList();

        linearLayout = (LinearLayoutCompat) findViewById(R.id.linear);
        LayoutInflater inflater = LayoutInflater.from(this);

        for (int i=0; i<l1.size(); i++){
             view = inflater.inflate(R.layout.addvieww,null);
            TextView t1 = view.findViewById(R.id.t1);
            TextView t2 = view.findViewById(R.id.t2);
            t1.setText(l1.get(i).toString());
            t2.setText(l2.get(i).toString());
            linearLayout.addView(view);
        }

    }

    private ArrayList<String> sendList(){
        ArrayList list = new ArrayList();

        for(int i=0; i<10; i++){
            list.add(""+i+" 번째 입니다.");
        }

        return list;
    }
    private ArrayList<String> secondeList(){
        ArrayList list = new ArrayList();

        for(int i=0; i<10; i++){
            list.add(""+i+" 차량입니다..");
        }

        return list;
    }
}
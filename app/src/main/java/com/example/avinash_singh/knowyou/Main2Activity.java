package com.example.avinash_singh.knowyou;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private DatabaseReference userDatabase;
    private FirebaseUser currentUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String currentUid = currentUser.getUid();
        userDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(currentUid).child("");



        PieChart pie = findViewById(R.id.piechart1);

        ArrayList<String> y = new ArrayList<>();

//        y.add(new Entry(0,0,));
//        y.add(new Entry(0,0));
//        y.add(new Entry(0,0));
//        y.add(new Entry(0,0));
//
//
//        PieDataSet dataSet = new PieDataSet(y,"Color");
//
//        PieData data = new PieData(x,y);
//        data.setValueFormatter(new PercentFormatter());
//        pie.setData(data);
//        pie.setDescription("Pie cHART");
//
//        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
//        data.setValueTextSize(13f);
//        data.setValueTextColor(Color.DKGRAY);
//        pie.setOnChartValueSelectedListener((OnChartValueSelectedListener) this);


    }
}

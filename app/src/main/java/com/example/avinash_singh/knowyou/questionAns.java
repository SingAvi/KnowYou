package com.example.avinash_singh.knowyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class questionAns extends AppCompatActivity {

    CheckBox q11,q12,q13,q14;
    CheckBox q21,q22,q23,q24;
    CheckBox q31,q32,q33,q34;
    CheckBox q41,q42,q43,q44;
    CheckBox q51,q52,q53,q54;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;
    Integer A=0,B=0,C=0,D=0;
    private Integer z =1;

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ans);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        firebaseAuth = FirebaseAuth.getInstance();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Survey submitted", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                    QuestionOne();
                    QuestionTwo();
                    QuestionThree();
                    QuestionFour();
                    QuestionFive();

                    CountQueOne();
            }
        });

        t = findViewById(R.id.tv);

        q11 = findViewById(R.id.checkBox);
        q12 = findViewById(R.id.checkBox2);
        q13 = findViewById(R.id.checkBox3);
        q14 = findViewById(R.id.checkBox4);

        q21 = findViewById(R.id.checkBox21);
        q22 = findViewById(R.id.checkBox22);
        q23 = findViewById(R.id.checkBox23);
        q24 = findViewById(R.id.checkBox24);

        q31 = findViewById(R.id.checkBox31);
        q32 = findViewById(R.id.checkBox32);
        q33 = findViewById(R.id.checkBox33);
        q34 = findViewById(R.id.checkBox34);

        q41 = findViewById(R.id.checkBox41);
        q42 = findViewById(R.id.checkBox42);
        q43 = findViewById(R.id.checkBox43);
        q44 = findViewById(R.id.checkBox44);

        q51 = findViewById(R.id.checkBox51);
        q52 = findViewById(R.id.checkBox52);
        q53 = findViewById(R.id.checkBox53);
        q54 = findViewById(R.id.checkBox54);

    }

    private void CountQueOne() {

        databaseReference = FirebaseDatabase.getInstance().getReference().child("que1");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                HashMap<String, Object> map = new HashMap<>();

                if (A == 1) {

                    String a = (String) dataSnapshot.child("1").getValue();


                    Integer p = Integer.parseInt(a);


                    String w = String.valueOf(p);


                    databaseReference = FirebaseDatabase.getInstance().getReference().child("que1");
                    map = new HashMap<>();
                    map.put("1",w);
                    A =0;




                }

                databaseReference.setValue(map);


            }



            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


    private void QuestionFive() {

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentUser.getUid();


        if(q51.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q5");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Genre","Classical");
            databaseReference.updateChildren(map);
        }
        else if (q52.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q5");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Genre","Rock");
            databaseReference.updateChildren(map);
        }
        else if (q53.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q5");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Genre","Melody");
            databaseReference.updateChildren(map);
        }
        else if (q54.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q5");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Genre","Sufi");
            databaseReference.updateChildren(map);
        }


    }

    private void QuestionFour() {

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentUser.getUid();


        if(q41.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q4");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Drink","Coffee");
            databaseReference.updateChildren(map);
        }
        else if (q42.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q4");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Drink","Tea");
            databaseReference.updateChildren(map);
        }
        else if (q43.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q4");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Drink","Soft q4");
            databaseReference.updateChildren(map);
        }
        else if (q44.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q4");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Drink","Hard Drink");
            databaseReference.updateChildren(map);
        }
    }

    private void QuestionThree() {

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentUser.getUid();


        if(q31.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q3" );

            HashMap<String, Object> map = new HashMap<>();

            map.put("Washing Powder","Surf Excel");
            databaseReference.updateChildren(map);
        }
        else if (q32.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q3" );

            HashMap<String, Object> map = new HashMap<>();

            map.put("Washing Powder","Tide");
            databaseReference.updateChildren(map);
        }
        else if (q33.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q3 ");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Washing Powder","Ariel");
            databaseReference.updateChildren(map);
        }
        else if (q34.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q3 ");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Washing Powder","Nirma");
            databaseReference.updateChildren(map);
        }

    }

    private void QuestionTwo() {

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentUser.getUid();


        if(q21.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q2");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Best Quality Time","Cycling");
            databaseReference.updateChildren(map);
        }
        else if (q22.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q2");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Best Quality Time","Biking");
            databaseReference.updateChildren(map);
        }
        else if (q23.isChecked())
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q2");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Best Quality Time","Sleeping");
            databaseReference.updateChildren(map);
        }
        else
        {
            databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q2");

            HashMap<String, Object> map = new HashMap<>();

            map.put("Best Quality Time","Running");
            databaseReference.updateChildren(map);
        }



    }


    private void QuestionOne()
        {

            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            String uid = currentUser.getUid();


            if(q11.isChecked())
            {
                A = 1;
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q1");

                HashMap<String, Object> map = new HashMap<>();

                map.put("Color","red");

                databaseReference.updateChildren(map);
            }
            else if (q12.isChecked())
            {
                A=2;
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q1");

                HashMap<String, Object> map = new HashMap<>();

                map.put("Color","blue");
                databaseReference.updateChildren(map);
            }
            else if (q13.isChecked())
            {
                A=3;
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q1");

                HashMap<String, Object> map = new HashMap<>();

                map.put("Color","green");
                databaseReference.updateChildren(map);
            }
            else
            {
                A=4;
                databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child(uid).child("q1");

                HashMap<String, Object> map = new HashMap<>();

                map.put("Color","yellow");
                databaseReference.updateChildren(map);
            }




    }

    @Override
    public void onStart()
    {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

        if(currentUser == null)
        {
            sendToStart();
        }


    }

    private void sendToStart() {

        startActivity(new Intent(questionAns.this,MainActivity.class));
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            FirebaseAuth.getInstance().signOut();
            sendToStart();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    }



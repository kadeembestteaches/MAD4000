package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Person> employees  = new ArrayList();

        Person p1 = new Person("Jon","Snow","Accounts","M",55000);
        Person p2 = new Person("Harsdeep","Snow","I.T","M",85000);
        Person p3 = new Person("Jamal","Snow","Supply Chain","M",62000);
        Person p4 = new Person("Thanos","Snow","Inventory","M",65000);
        Person p5 = new Person("Superman","Snow","Operations","M",35000);
        Person p6 = new Person("Wonder","Snow","Operations","F",35000);
        Person p7 = new Person("Jenelle","Snow","Managment","F",185000);
        Person p8 = new Person("Arshdeep","Snow","I.T","M",85000);


        employees.add(p1);
        employees.add(p2);
        employees.add(p3);
        employees.add(p4);
        employees.add(p5);
        employees.add(p6);
        employees.add(p7);
        employees.add(p8);


        employees.add(p8);
        employees.add(p8);
        employees.add(p8);
        employees.add(p8);
        employees.add(p8);
        employees.add(p8);
        employees.add(p8);
        employees.add(p8);



        PersonListViewAdapter adapter  = new PersonListViewAdapter(this,R.layout.list_layout,employees);
        //  ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,employeeNames);
        final ListView mainView = (ListView) findViewById(R.id.mainListview);

        mainView.setAdapter(adapter);

        mainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });
    }
}

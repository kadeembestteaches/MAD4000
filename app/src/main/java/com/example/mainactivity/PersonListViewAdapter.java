package com.example.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonListViewAdapter extends ArrayAdapter<Person>
{
    private ArrayList<Person> persons;
    private Context context;
    private int resource;

    public PersonListViewAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        persons=objects;
        this.context=context;
        this.resource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        String firstName =persons.get(position).getFirstName();
        String lastName = persons.get(position).getLastName();
        String department =persons.get(position).getDepartment();
        String gender =persons.get(position).getGender();
        double salary =persons.get(position).getSalary();


        //Create an Layout inflater;
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(this.resource,parent,false);


        //fetch text views

        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtDepartment = (TextView) convertView.findViewById(R.id.txtDepartment);
        //set text for each text views

        txtName.setText(firstName + " " +lastName);
        txtDepartment.setText(department);

        return convertView;


    }


}

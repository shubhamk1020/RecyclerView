package com.mastercoding.recyclerview.multipleviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mastercoding.recyclerview.R;
import com.mastercoding.recyclerview.multipleView.MultipleTypeAdapter;

import java.util.ArrayList;

public class MultipleViewtype extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_viewtype);
        
        recyclerView = findViewById(R.id.multiple_type_rv);
        
        InsertDataRV();
    }

    private void InsertDataRV() {

        ArrayList<MultiEmployee> employees = new ArrayList<>();
        // Adding data to it

        MultiEmployee employee1 = new MultiEmployee();

        // A phone Item

        employee1.setName("Shubham");
        employee1.setAddress("New York");
        employee1.setPhone("+6549792454");
        employees.add(employee1);

        // An email item
        MultiEmployee employee2 = new MultiEmployee();

        employee2.setName("Ravi");
        employee2.setAddress("London");
        employee2.setEmail("ravir4512@gmail.com");
        employees.add(employee2);



        MultiEmployee employee3 = new MultiEmployee();

        // A phone Item

        employee3.setName("Shubham");
        employee3.setAddress("New York");
        employee3.setPhone("+6549792454");
        employees.add(employee3);

        // An email item
        MultiEmployee employee4 = new MultiEmployee();

        employee4.setName("Ravi");
        employee4.setAddress("London");
        employee4.setEmail("ravir4512@gmail.com");
        employees.add(employee4);

        // set Adapter
        MultipleTypeAdapter adapter = new MultipleTypeAdapter(this, employees);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
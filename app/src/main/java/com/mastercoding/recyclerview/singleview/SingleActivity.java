package com.mastercoding.recyclerview.singleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mastercoding.recyclerview.R;

import java.util.ArrayList;

public class SingleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button btn;

    private ArrayList<Employee> employees = new ArrayList<>();
    private SingleAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        recyclerView = findViewById(R.id.single_recy);
        btn = findViewById(R.id.single_recy_btn);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        adapter = new SingleAdapter(this,employees);
        recyclerView.setAdapter(adapter);

        CreateList();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(adapter.getSelected() != null){
                   ShowToast(adapter.getSelected().getName());

               }
               else
               ShowToast("No Selection");
            }
        });
    }


    private void CreateList() {

        employees = new ArrayList<>();
        for(int i = 0; i<2000; i++){
            Employee employee = new Employee();
            employee.setName("Employee " +(i+1));
            employees.add(employee);
        }
        adapter.SetEmployee(employees);

    }

    private void ShowToast(String msg) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        
        
    }

}
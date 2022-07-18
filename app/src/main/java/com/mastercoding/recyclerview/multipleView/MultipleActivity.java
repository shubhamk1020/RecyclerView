package com.mastercoding.recyclerview.multipleView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mastercoding.recyclerview.R;
import com.mastercoding.recyclerview.singleview.Employee;

import java.util.ArrayList;

public class MultipleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<Employee> employees = new ArrayList<>();
    private MultipleAdapter adapter;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);

        recyclerView = findViewById(R.id.multiple_recycler);
        btn = findViewById(R.id.mutbtn);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));
        adapter = new MultipleAdapter(this,employees);
        recyclerView.setAdapter(adapter);

        CreateListOfData();


        // Handling Click Event on the button

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adapter.getSelected().size()>0){
                    // Getting a list of item Selected
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int i=0; i<adapter.getSelected().size(); i++){
                        stringBuilder.append(adapter.getSelected().get(i).getName());
                        stringBuilder.append("\n");
                    }

                    ShowToast(stringBuilder.toString().trim());
                }
                else
                    ShowToast("No Selection");
            }
        });

    }
    private void CreateListOfData() {

        employees = new ArrayList<>();

        for(int i = 0; i<2000;i++){
            Employee employee = new Employee();
            employee.setName("Employee "+ (i+1));

            // Showing at last one selection

            if(i==0){
                employee.setChecked(true);

            }
            employees.add(employee);

        }
        adapter.setEmployees(employees);
            }
           private void ShowToast(String msg){
               Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
           }
}
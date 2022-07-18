package com.mastercoding.recyclerview.multipleView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercoding.recyclerview.R;
import com.mastercoding.recyclerview.singleview.Employee;


import java.util.ArrayList;

public class MultipleAdapter extends RecyclerView.Adapter<MultipleAdapter.MultipleHolder>    {

    private Context context;
    private ArrayList<Employee>  employees;

    // constructor


    public MultipleAdapter(Context context, ArrayList<Employee> employees) {
        this.context = context;
        this.employees = employees;
    }

    public void setEmployees(ArrayList<Employee> employees){
        this.employees = new ArrayList<>();
        this.employees = employees;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MultipleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_employee,parent
                ,false
        );
        return new  MultipleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MultipleHolder holder, int position) {

        holder.bind(employees.get(position));
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class MultipleHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;


        public MultipleHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.emp_name);
            imageView = itemView.findViewById(R.id.imageView);

        }

        // Getting the selected items
        void bind(final Employee employee){
            imageView.setVisibility(employee.isChecked() ? View.VISIBLE : View.GONE);
            textView.setText(employee.getName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    public ArrayList<Employee> getAll(){
        return employees;
    }
        // Getting Selected with btn clicked
    public ArrayList<Employee> getSelected() {

        ArrayList<Employee> selected = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).isChecked()) {
                selected.add(employees.get(i));
            }

        }
        return selected;
    }
}

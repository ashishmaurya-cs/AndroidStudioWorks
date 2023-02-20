package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editName,editPass,editText3,editText5,editText6;
    myDbAdapter mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName=(EditText)findViewById(R.id.editName);
        editPass=(EditText)findViewById(R.id.editPass);
        editText6=(EditText)findViewById(R.id.editText6);
        editText3=(EditText)findViewById(R.id.editText3);
        editText5=(EditText)findViewById(R.id.editText5);
        mydb=new myDbAdapter(this);
    }



    public void addUser(View view) {
        String t1=editName.getText().toString();
        String t2=editPass.getText().toString();
        if(t1.isEmpty()|| t2.isEmpty())
        {
            Toast.makeText(this, " Enter name and password both", Toast.LENGTH_SHORT).show();
        }
        else
        {
            long id = mydb.insertData(t1,t2);
            if(id<=0)
            {
                Toast.makeText(this, "insertion unsucessfull", Toast.LENGTH_SHORT).show();

                editName.setText("");
                editPass .setText("");
            } else
            {
                Toast.makeText(this, "Insertion Successful", Toast.LENGTH_SHORT).show();
                editName.setText("");
                editPass.setText("");
            }

        }


    }
    public void viewdata(View view) {
        String data = mydb.getData();
        Toast.makeText(this,data, Toast.LENGTH_SHORT).show();


    }

    public void update(View view) {

        String t1=editText3.getText().toString();
        String t2=editText5.getText().toString();
        if(t1.isEmpty()|| t2.isEmpty())
        {
            Toast.makeText(this, " Enter old name and new name both", Toast.LENGTH_SHORT).show();
        }
        else
        {
            long id = mydb.updatedata(t1,t2);
            if(id<=0)
            {
                Toast.makeText(this, "update unsucessfull", Toast.LENGTH_SHORT).show();

                editName.setText("");
                editPass .setText("");
            } else
            {
                Toast.makeText(this, "update Successful", Toast.LENGTH_SHORT).show();
                editName.setText("");
                editPass.setText("");
            }

        }
    }


    public void delete( View view)
    {
        String uname = editText6.getText().toString();
        if(uname.isEmpty())
        {

            Toast.makeText(this, "Enter Data", Toast.LENGTH_SHORT).show();
        }
        else{
            int a= mydb.delete(uname);
            if(a<=0)
            {
                Toast.makeText(this, "Unsuccessful", Toast.LENGTH_SHORT).show();
                editText6.setText("");
            }
            else
            {
                Toast.makeText(this, "DELETED", Toast.LENGTH_SHORT).show();
                editText6.setText("");
            }
        }
    }
}
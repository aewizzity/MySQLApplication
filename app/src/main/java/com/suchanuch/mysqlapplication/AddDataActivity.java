package com.suchanuch.mysqlapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        final EditText newTodoListText = (EditText) findViewById(R.id.editTextAddTask);
        final Button newTodoListButton = (Button) findViewById(R.id.btnAddNewTask);
        newTodoListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TodoList todoList = new TodoList();
               // Log.d("asd",String.valueOf(newTodoListText.getText()));
                todoList.setTaskname(String.valueOf(newTodoListText.getText())); //setTaskname ชื่อของคอลัมน์ในฐานข้อมูล โดยส่งชื่อ Id และ Taskname ลงฐานข้อมูล ซึ่งอยู่ที่ TodoListDAO
                TodoListDAO todoListDAO = new TodoListDAO(getApplicationContext());
                todoListDAO.open();
                todoListDAO.add(todoList);
                todoListDAO.close();
                finish();
            }
        });


    }
}

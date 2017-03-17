package com.suchanuch.mysqlapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListView extends BaseAdapter {

    private static Activity activity;
    private static LayoutInflater inflater;
    ArrayList<TodoList> myTodoList;

    public MyListView(Activity activity, ArrayList<TodoList> myTodoList) {
        this.myTodoList = myTodoList;
        this.activity = activity;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }//MyListView

    @Override
    public int getCount() {
        return myTodoList.size();
    }//getCount

    @Override
    public Object getItem(int position) {
        return myTodoList.get(position);
    }//Object

    @Override
    public long getItemId(int position) {
        return myTodoList.get(position).getTaskid();
    }//getItemId

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        v = inflater.inflate(R.layout.activity_my_list_view, null);
        TextView textView = (TextView) v.findViewById(R.id.listview_text);
        TodoList todoList = myTodoList.get(position);
        textView.setText(todoList.getTaskname());
        Log.d("asd",todoList.getTaskname());
        //Log.d("getView: ",String.valueOf( myTodoList.size()));
        return v;

    }//getView
}

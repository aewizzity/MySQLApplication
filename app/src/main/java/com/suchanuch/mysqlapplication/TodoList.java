package com.suchanuch.mysqlapplication;

import java.io.Serializable;

/**
 * Created by suchanuch on 2/10/2017.
 */

public class TodoList implements Serializable{

    public int taskid;
    public String taskname;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }


}

package com.tage.model;

import javax.persistence.*;

/**
 * Created by tage on 3/30/16.
 */
@Entity
@Table(name = "t_log")
public class Log {
    private int id;
    private String msg;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

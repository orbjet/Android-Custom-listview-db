package com.sw.customlistview;

/**
 * Created on 16.6.2015.
 */
public class DBModel {


    private int _id;
    private String memo;
    private String date;


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

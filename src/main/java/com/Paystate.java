package com;

/**
 * Created by sc on 2018/11/3.
 */
public class Paystate {
    private int code;
    private String msg;
    private Object data;

    public Paystate(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Paystate{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

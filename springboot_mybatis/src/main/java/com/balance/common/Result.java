package com.balance.common;

/**
 * Created by liukai on 2018/9/13.
 */

public class Result {
    private int retcode=1;
    private String msg="操作成功";
    private Object data;

    public Result() {
    }

    public Result(int retcode, String msg) {
        this.retcode = retcode;
        this.msg = msg;
    }

    public Result(int retcode, String msg, Object data) {
        this.retcode = retcode;
        this.msg = msg;
        this.data = data;
    }

    public Result(String msg) {
        this.msg = msg;
        this.retcode=0;
    }

    public Result(int retcode) {
        this.retcode = retcode;
        this.msg="操作失败";
    }

    public Result(Object data) {
        this.data = data;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "retcode=" + retcode +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

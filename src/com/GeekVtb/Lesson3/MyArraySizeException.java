package com.GeekVtb.Lesson3;

public class MyArraySizeException extends RuntimeException{
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MyArraySizeException(String msg) {
        super("Ошибка размерности массива" + msg);
    }
}

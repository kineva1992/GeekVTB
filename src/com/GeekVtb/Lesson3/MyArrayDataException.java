package com.GeekVtb.Lesson3;

public class MyArrayDataException extends RuntimeException{
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число" + msg);
        this.msg = msg;
    }
}

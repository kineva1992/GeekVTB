package com.GeekVtb.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskOneTwo {

    /**
     * * Практическое задание
     * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого
     *  ссылочного типа).
     *
     * 2. Написать метод, который преобразует массив в ArrayList.
     */

    //1. Написать метод, который меняет два элемента массива местами (массив может быть любого
    // ссылочного типа).
    static <T> void swap(T[] arr, int firstIndex, int seccondIndex) {
        T oneValue = arr[firstIndex];
        arr[firstIndex] = arr[seccondIndex];
        arr[seccondIndex] = oneValue;
    }

    //2. Написать метод, который преобразует массив в ArrayList.
    static <T> ArrayList<T> convertToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }


}

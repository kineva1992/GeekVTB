package com.GeekVtb.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<T extends Fruit> {

    /**
     * Внутри класса Box написать метод Compare, который позволяет сравнить текущую
     * коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
     * равны, False — в противном случае. Можно сравнивать коробки с яблоками и
     * апельсинами.
     *
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
     * объекты, которые были в первой.
     *
     * Не забываем про метод добавления фрукта в коробку.
     */

    private ArrayList<T> list;

    public Box(ArrayList<T> list) {
        this.list = list;
    }

    public Box(T[] frunt) {
        this.list = new ArrayList<>(Arrays.asList(frunt));
    }

    public float getWeigth() {
        float weight = 0.0f;

        for(T o : list) {
            weight += o.getWeigth();
        }
        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(Collection<T> fruit) {
        fruit.addAll(fruit);
    }

    public boolean compare(Box<?> o) {
        return Math.abs(this.getWeigth() - o.getWeigth()) < 0.0001;
    }

}

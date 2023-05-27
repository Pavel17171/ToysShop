package org.example.Model.Cases;

import org.example.Model.Toys.Toy;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Case03 {
    /**
     * Сортировка игрушек в массиве по приоритетности (для вывода)
     *
     * @param array массив создается в первом пункте
     */
    public static void case03(List<Toy> array) {
        if (array.size() > 0) {
            Queue<Toy> priorityToys = new PriorityQueue<>(new Toy());
            priorityToys.addAll(array);
            while (!priorityToys.isEmpty()) {
                System.out.println(priorityToys.poll());
            }
        } else {
            System.out.println("Нет игрушек для сортировки");
        }
    }
}

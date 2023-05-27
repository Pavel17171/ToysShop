package org.example.Model.Cases;

import org.example.Model.ArrayOfToys;
import org.example.Model.Toys.Toy;

import java.util.List;

public class Case02 {
    /**
     * Показ массива розыгрываемых игрушек
     *
     * @param array массив создается в первом пункте
     */
    public static void case02(List<Toy> array) {
        int count = array.size();
        if (count == 0) {
            System.out.println("Нет игрушек для розыгрыша");
        } else {
            ArrayOfToys.printArrayOfToys(array);
        }
    }
}

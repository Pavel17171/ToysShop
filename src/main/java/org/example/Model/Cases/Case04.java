package org.example.Model.Cases;

import org.example.Model.ArrayOfToys;
import org.example.Model.Toys.Toy;

import java.util.*;

public class Case04 {
    /**
     * Запуск розыгрыша. Розыгранная игрушка удаляется из мессива
     *<p>- заполняем новый массив количеством игрушек, равным вероятности их выпадения
     *<p>- затем рандомно выбираем игрушку и удаляем эту игрушку из первоначального массива
     *<p>- при следующем запуске действия повторяются, только без удаленной игрушки
     * @param array массив создается в первом пункте
     */
    public static void case04(List<Toy> array) {

        int sizeArray = array.size();
        if (sizeArray > 1) {
            List<Toy> arrayForRaffle = new ArrayList<>();
            for (Toy t : array) {
                int count = t.getFrequencyOfLoss();
                while (count > 0) {
                    arrayForRaffle.add(t);
                    count--;
                }
            }
            int r = new Random().nextInt(arrayForRaffle.size());
            Toy tempToy = arrayForRaffle.get(r);
            System.out.println("Выпала игрушка:\n" + tempToy);
            ArrayOfToys.deleteFromArrayOfToys(tempToy);
        } else if (sizeArray == 1) {
            System.out.println("Последняя игрушка:\n");
            System.out.println(array.get(0));
            ArrayOfToys.deleteFromArrayOfToys(array.get(0));
        } else {
            System.out.println("Нет игрушек для розыгрыша");
        }
    }
}

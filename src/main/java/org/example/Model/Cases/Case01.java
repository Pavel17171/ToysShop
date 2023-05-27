package org.example.Model.Cases;

import org.example.Model.ArrayOfToys;

import java.util.Scanner;

public class Case01 {
    /**
     * Наполнение массива игрушками для розыгрыша
     */
    public static void case01() {
        Scanner sc = new Scanner(System.in);
        int minCount = 3;
        int count = ArrayOfToys.getArrayOfToys().size();
        while (count < minCount) {
            System.out.printf("Добавьте минимум %d игрушки для розыгрыша\n", minCount - count);
            ArrayOfToys.setToy();
            count += 1;
        }
        boolean flagCase1 = true;
        while (flagCase1) {
            System.out.println("Добавить ещё?");
            System.out.println("Y/Д - да; N/Н - нет");
            String ans = sc.next().toLowerCase();
            if (ans.equals("y") || ans.equals("д")) {
                ArrayOfToys.setToy();
                count += 1;
            } else if (ans.equals("n") || ans.equals("н")) {
                if (count < minCount) {
                    System.out.println("Недостаточно игрушек");
                    System.out.printf("Надо добавить как минимум %d игрушек\n", (minCount - count));
                } else {
                    flagCase1 = false;
                }
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        System.out.printf("Количество игрушек в розыгрыше: %d\n", count);
    }
}

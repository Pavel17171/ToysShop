package org.example.Model;

import org.example.Model.CheckInput.CheckInput;
import org.example.Model.Logger.Logger;
import org.example.Model.Toys.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayOfToys {

    public static List<Toy> arrayOfToys = new ArrayList<>();
    public Toy toy;
    public static int id = 0;

    public ArrayOfToys(Toy toy) {
        this.toy = toy;
    }

    /**
     * Массив игрушек
     *
     * @return возвращает массив игрушек
     */
    public static List<Toy> getArrayOfToys() {
        return arrayOfToys;
    }

    /**
     * Добавляет игрушки в массив
     *
     * @param toy игрушка для добавления в массив
     */
    public static void setArrayOfToys(Toy toy) {
        arrayOfToys.add(toy);
    }

    /**
     * Создание новой игрушки и добавление в массив
     */
    public static void setToy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название игрушки: ");
        String nameToy = sc.nextLine();
        int minLoss = Toy.getMinLoss();
        int maxLoss = Toy.getMaxLoss();
        int frOfLoss = 0;
        if (Toy.getLenNameToy() < nameToy.length()) {
            Toy.setLenNameToy(nameToy.length());
        }
        boolean flag = true;
        while (flag) {
            System.out.printf("Введите частоту выпадения (от %d до %d): ", minLoss, maxLoss);
            String frequencyOfLoss = sc.nextLine();
            if (CheckInput.checkInt(frequencyOfLoss)) {
                frOfLoss = Integer.parseInt(frequencyOfLoss);
                if (frOfLoss >= minLoss && frOfLoss <= maxLoss)
                    flag = false;
                else {
                    System.out.printf("Введите число от %d до %d\n", minLoss, maxLoss);
                }
            } else {
                System.out.printf("Введите число от %d до %d\n", minLoss, maxLoss);
            }
        }
        id += 1;
        Toy newToy = new Toy(id, nameToy, frOfLoss);
        setArrayOfToys(newToy);
        Logger logger = new Logger();
        logger.update("Добавление: ", newToy);
    }

    public Toy getToy() {
        return toy;
    }

    /**
     * Удаление игрушки из массива по id
     *
     * @param toy игрушка для удаления
     */
    public static void deleteFromArrayOfToys(Toy toy) {
        Logger logger = new Logger();
        int idDel = toy.getId();
        boolean flag = true;
        int index = -1;
        for (int i = 0; i < arrayOfToys.size(); i++) {
            if (idDel == arrayOfToys.get(i).getId()) {
                index = i;
            }
        }
        if (index >= 0) {
            logger.update("Розыграна игрушка: ", arrayOfToys.get(index));
            arrayOfToys.remove(index);
        } else {
            System.out.println("Такой игрушки нет");
        }
    }

    /**
     * Вывод массива игрушек
     *
     * @param array массив, который надо вывести
     */
    public static void printArrayOfToys(List<Toy> array) {
        for (Toy t : array) {
            System.out.println(t.toString());
        }
    }

    /**
     * Строковое представление массива
     *
     * @return возвращает массив в виде строки String
     */
    @Override
    public String toString() {
        String text = "";
        for (Toy toy : arrayOfToys) {
            text += toy.toString();
        }
        return text;
    }
}

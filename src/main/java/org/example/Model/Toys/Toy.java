package org.example.Model.Toys;

import java.util.Comparator;

public class Toy implements Comparator<Toy> {
    protected int id;
    protected String toy_name;
    protected int frequencyOfLoss;
    public static int minLoss = 1;
    public static int maxLoss = 100;
    public static int lenNameToy = 1;

    /**
     * Конструктор игрушки
     *
     * @param id              id номер (задается автоматически при запуске программы)
     * @param toy_name        название игрушки в формате String
     * @param frequencyOfLoss вероятность выпадения игрушки (Integer от 1 до 100)
     */
    public Toy(int id, String toy_name, int frequencyOfLoss) {
        this.id = id;
        this.toy_name = toy_name;
        this.frequencyOfLoss = frequencyOfLoss;
    }

    /**
     * Пустой конструктор игрушки
     */
    public Toy() {
    }

    /**
     * ID игрушки
     *
     * @return id игрушки (Integer)
     */
    public int getId() {
        return id;
    }

    /**
     * Начальное значение вероятности выпадения игрушки
     *
     * @return возвращает начальное значение вероятности выпадения игрушки (int)
     */
    public static int getMinLoss() {
        return minLoss;
    }

    /**
     * Конечное значение вероятности выпадения игрушки
     *
     * @return возвращает конечное значение вероятности выпадения игрушки (int)
     */
    public static int getMaxLoss() {
        return maxLoss;
    }

    /**
     * Вероятность выпадения игрушки
     *
     * @return возвращает вероятность выпадения игрушки (int)
     */
    public int getFrequencyOfLoss() {
        return frequencyOfLoss;
    }

    /**
     * Максимальная длина названия игрушки в массиве
     *
     * @param lenText длина названия (int)
     * @param text    название игрушки (String)
     * @return возвращает максимальную длину названия (int)
     */
    public String lenString(int lenText, String text) {
        String newText = text;
        int l = text.length();
        if (l < lenText) {
            while (l < lenText) {
                newText += " ";
                l++;
            }
        }
        return newText;
    }

    /**
     * Задание максимальеого значения длины названия игрушки
     *
     * @param lenNameToy задает новое значение максимальной длины названия игрушки
     */
    public static void setLenNameToy(int lenNameToy) {
        Toy.lenNameToy = lenNameToy;
    }

    /**
     * Длина названия игрушки
     *
     * @return возвращает длину названия игрушки
     */
    public static int getLenNameToy() {
        return lenNameToy;
    }

    /**
     * Строковый запись информации об игрушке
     *
     * @return возвращает информацию об игрушке в формате String
     */
    @Override
    public String toString() {
        return String.format("id: %3d | %s | %2d", id, lenString(lenNameToy, toy_name), frequencyOfLoss);

    }

    /**
     * Задание параметров для компаратора
     *
     * @param toy1 the first object to be compared.
     * @param toy2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Toy toy1, Toy toy2) {
        return toy2.getFrequencyOfLoss() > toy1.getFrequencyOfLoss() ? 1 : -1;
    }
}

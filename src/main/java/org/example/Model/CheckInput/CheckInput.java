package org.example.Model.CheckInput;

public class CheckInput {

    /**
     * Проверка, что текст в строке является целым цислом
     *
     * @param inputVar введеная строка String
     * @return если строку можно перевести в Integer - true
     */
    public static boolean checkInt(String inputVar) {
        try {
            Integer.parseInt(inputVar);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}

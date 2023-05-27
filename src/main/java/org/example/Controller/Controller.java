package org.example.Controller;

import org.example.Model.ArrayOfToys;
import org.example.Model.Cases.Case01;
import org.example.Model.Cases.Case02;
import org.example.Model.Cases.Case04;
import org.example.Model.Cases.Case03;
import org.example.View.View;
import org.example.Model.Logger.Logger;

import java.util.Scanner;

public class Controller implements IController {
    /**
     * Выполнение программы
     */
    @Override
    public void program() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        View view = new View();
        Logger logger = new Logger();
        logger.updateString("Start");
        while (flag) {
            view.print_menu();
            String answer = sc.next();
            String logText = "Input {" + answer + "}";
            logger.updateString(logText);
            switch (answer) {
                case "0" -> {
                    logger.updateString("End\n");
                    System.out.println("Exit");
                    flag = false;
                }
                case "1" -> {
                    Case01.case01();
                }
                case "2" -> {
                    System.out.println("2. Показать розыгрываемый ассортимент");
                    Case02.case02(ArrayOfToys.getArrayOfToys());
                }
                case "3" -> {
                    Case03.case03(ArrayOfToys.getArrayOfToys());
                }
                case "4" -> {
                    System.out.println("3. Запустить розыгрыш");
                    Case04.case04(ArrayOfToys.getArrayOfToys());
                }
                default -> {
                    System.out.println("Такого пункта нет");
                }
            }
        }
    }
}

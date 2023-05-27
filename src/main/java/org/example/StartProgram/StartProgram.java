package org.example.StartProgram;

import org.example.Controller.Controller;
import org.example.Model.Logger.CreateLogFile;

public class StartProgram {
    /**
     * Запуск программы
     * @param args
     */
    public static void main(String[] args) {
        CreateLogFile.createLogFile();
        Controller start = new Controller();
        start.program();
    }
}

package org.example.Model.Logger;

import java.io.File;

public class CreateLogFile {

    public static String dirName = "src/main/java/org/example/Log";
    public static String fN = "ToysShopLog.txt";
    private static final String fileName = dirName + "/" + fN;

    /**
     * Создание файла логирования и директории для его хранения
     */
    public static void createLogFile() {
        File file = new File(dirName);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("create");
            } else {
                System.out.println("not create");
            }
        }
    }

    /**
     * Название файла и путь к нему
     *
     * @return возвращает путь и название файла логирования в формате String
     */
    public static String getFileName() {
        return fileName;
    }
}

package org.example.Model.Logger;

import org.example.Model.Toys.Toy;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger implements ILog {

    Date dateTime = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd kk:mm");
    String fileName = CreateLogFile.getFileName();

    /**
     * Запись лога в файл (сообщение и информация об игрушке)
     *
     * @param message текст сообщения
     * @param toy     игрушка
     */
    @Override
    public void update(String message, Toy toy) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.append((String.format("Log от %s:    %s {%s}\n", format1.format(dateTime), message, toy.toString())));
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Запись лога в файл (сообщение)
     *
     * @param text текст сообщения
     */
    @Override
    public void updateString(String text) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.append((String.format("Log от %s:    %s\n", format1.format(dateTime), text)));
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

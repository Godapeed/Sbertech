package io;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Создание папки log при ее отсутвии
        File logFolder = new File("log");
        if (!logFolder.exists()) {
            logFolder.mkdirs();
        }

        String fileName = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".txt";
        File logFile = new File("log/" + fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
            //Зачистка папки log
            File[] logFiles = logFolder.listFiles();
            if (logFiles != null && logFiles.length > 2) {
                for (File file : logFiles) {
                    file.delete();
                }
            }

            //Запись в зоданный log файл
            DataContainer dataContainer = new DataContainer(12, "dsd", true);
            dataContainer.writeToFile("log/"+fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.example.notebookapp;

import java.io.File;
import java.io.IOException;

public class SavedInformationFile {


    public void getUpgradeFile() {

        String currentDir = System.getProperty("user.dir");
        File file = new File(currentDir + "/saved.txt");
        System.out.println("Файл будет создан: " + file.getAbsolutePath());
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

    }


}




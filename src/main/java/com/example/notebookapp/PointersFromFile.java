package com.example.notebookapp;

import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PointersFromFile {
    public ArrayList<String> getPointers() throws IOException {
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get("D:\\для проектов\\NoteBookAPP\\editor.txt"));
        return lines  ;
    }
}

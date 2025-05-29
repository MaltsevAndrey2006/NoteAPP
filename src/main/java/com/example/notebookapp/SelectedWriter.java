package com.example.notebookapp;

import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import javax.swing.*;
import java.io.PrintWriter;

public class SelectedWriter {

    public void writeSelected(ToggleGroup group, RadioMenuItem adioItem, PrintWriter writer) {
        if (group.getSelectedToggle() != null) {
            adioItem = (RadioMenuItem) group.getSelectedToggle();
            Text text = (Text) adioItem.getGraphic();
            writer.println(text.getText());
        } else {
            writer.println("-----");
        }
    }
}

package com.example.notebookapp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button saveButton;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Group1;

    @FXML
    private ToggleGroup Group10;

    @FXML
    private ToggleGroup Group11;

    @FXML
    private ToggleGroup Group12;

    @FXML
    private ToggleGroup Group13;

    @FXML
    private ToggleGroup Group14;

    @FXML
    private ToggleGroup Group15;

    @FXML
    private ToggleGroup Group16;

    @FXML
    private ToggleGroup Group17;

    @FXML
    private ToggleGroup Group18;

    @FXML
    private ToggleGroup Group19;

    @FXML
    private ToggleGroup Group2;

    @FXML
    private ToggleGroup Group20;

    @FXML
    private ToggleGroup Group3;

    @FXML
    private ToggleGroup Group4;

    @FXML
    private ToggleGroup Group5;

    @FXML
    private ToggleGroup Group6;

    @FXML
    private ToggleGroup Group7;

    @FXML
    private ToggleGroup Group8;

    @FXML
    private ToggleGroup Group9;

    @FXML
    private Text Text_10_1;

    @FXML
    private Text Text_10_10;

    @FXML
    private Text Text_10_11;

    @FXML
    private Text Text_10_12;

    @FXML
    private Text Text_10_13;

    @FXML
    private Text Text_10_14;

    @FXML
    private Text Text_10_15;

    @FXML
    private Text Text_10_16;

    @FXML
    private Text Text_10_17;

    @FXML
    private Text Text_10_18;

    @FXML
    private Text Text_10_19;

    @FXML
    private Text Text_10_2;

    @FXML
    private Text Text_10_20;

    @FXML
    private Text Text_10_3;

    @FXML
    private Text Text_10_4;

    @FXML
    private Text Text_10_5;

    @FXML
    private Text Text_10_6;

    @FXML
    private Text Text_10_7;

    @FXML
    private Text Text_10_8;

    @FXML
    private Text Text_10_9;

    @FXML
    private Text Text_11_1;

    @FXML
    private Text Text_11_10;

    @FXML
    private Text Text_11_11;

    @FXML
    private Text Text_11_12;

    @FXML
    private Text Text_11_13;

    @FXML
    private Text Text_11_14;

    @FXML
    private Text Text_11_15;

    @FXML
    private Text Text_11_16;

    @FXML
    private Text Text_11_17;

    @FXML
    private Text Text_11_18;

    @FXML
    private Text Text_11_19;

    @FXML
    private Text Text_11_2;

    @FXML
    private Text Text_11_20;

    @FXML
    private Text Text_11_3;

    @FXML
    private Text Text_11_4;

    @FXML
    private Text Text_11_5;

    @FXML
    private Text Text_11_6;

    @FXML
    private Text Text_11_7;

    @FXML
    private Text Text_11_8;

    @FXML
    private Text Text_11_9;

    @FXML
    private Text Text_12_1;

    @FXML
    private Text Text_12_10;

    @FXML
    private Text Text_12_11;

    @FXML
    private Text Text_12_12;

    @FXML
    private Text Text_12_13;

    @FXML
    private Text Text_12_14;

    @FXML
    private Text Text_12_15;

    @FXML
    private Text Text_12_16;

    @FXML
    private Text Text_12_17;

    @FXML
    private Text Text_12_18;

    @FXML
    private Text Text_12_19;

    @FXML
    private Text Text_12_2;

    @FXML
    private Text Text_12_20;

    @FXML
    private Text Text_12_3;

    @FXML
    private Text Text_12_4;

    @FXML
    private Text Text_12_5;

    @FXML
    private Text Text_12_6;

    @FXML
    private Text Text_12_7;

    @FXML
    private Text Text_12_8;

    @FXML
    private Text Text_12_9;

    @FXML
    private Text Text_13_1;

    @FXML
    private Text Text_13_10;

    @FXML
    private Text Text_13_11;

    @FXML
    private Text Text_13_12;

    @FXML
    private Text Text_13_13;

    @FXML
    private Text Text_13_14;

    @FXML
    private Text Text_13_15;

    @FXML
    private Text Text_13_16;

    @FXML
    private Text Text_13_17;

    @FXML
    private Text Text_13_18;

    @FXML
    private Text Text_13_19;

    @FXML
    private Text Text_13_2;

    @FXML
    private Text Text_13_20;

    @FXML
    private Text Text_13_3;

    @FXML
    private Text Text_13_4;

    @FXML
    private Text Text_13_5;

    @FXML
    private Text Text_13_6;

    @FXML
    private Text Text_13_7;

    @FXML
    private Text Text_13_8;

    @FXML
    private Text Text_13_9;

    @FXML
    private Text Text_14_1;

    @FXML
    private Text Text_14_10;

    @FXML
    private Text Text_14_11;

    @FXML
    private Text Text_14_12;

    @FXML
    private Text Text_14_13;

    @FXML
    private Text Text_14_14;

    @FXML
    private Text Text_14_15;

    @FXML
    private Text Text_14_16;

    @FXML
    private Text Text_14_17;

    @FXML
    private Text Text_14_18;

    @FXML
    private Text Text_14_19;

    @FXML
    private Text Text_14_2;

    @FXML
    private Text Text_14_20;

    @FXML
    private Text Text_14_3;

    @FXML
    private Text Text_14_4;

    @FXML
    private Text Text_14_5;

    @FXML
    private Text Text_14_6;

    @FXML
    private Text Text_14_7;

    @FXML
    private Text Text_14_8;

    @FXML
    private Text Text_14_9;

    @FXML
    private Text Text_15_1;

    @FXML
    private Text Text_15_10;

    @FXML
    private Text Text_15_11;

    @FXML
    private Text Text_15_12;

    @FXML
    private Text Text_15_13;

    @FXML
    private Text Text_15_14;

    @FXML
    private Text Text_15_15;

    @FXML
    private Text Text_15_16;

    @FXML
    private Text Text_15_17;

    @FXML
    private Text Text_15_18;

    @FXML
    private Text Text_15_19;

    @FXML
    private Text Text_15_2;

    @FXML
    private Text Text_15_20;

    @FXML
    private Text Text_15_3;

    @FXML
    private Text Text_15_4;

    @FXML
    private Text Text_15_5;

    @FXML
    private Text Text_15_6;

    @FXML
    private Text Text_15_7;

    @FXML
    private Text Text_15_8;

    @FXML
    private Text Text_15_9;

    @FXML
    private Text Text_16_1;

    @FXML
    private Text Text_16_10;

    @FXML
    private Text Text_16_11;

    @FXML
    private Text Text_16_12;

    @FXML
    private Text Text_16_13;

    @FXML
    private Text Text_16_14;

    @FXML
    private Text Text_16_15;

    @FXML
    private Text Text_16_16;

    @FXML
    private Text Text_16_17;

    @FXML
    private Text Text_16_18;

    @FXML
    private Text Text_16_19;

    @FXML
    private Text Text_16_2;

    @FXML
    private Text Text_16_20;

    @FXML
    private Text Text_16_3;

    @FXML
    private Text Text_16_4;

    @FXML
    private Text Text_16_5;

    @FXML
    private Text Text_16_6;

    @FXML
    private Text Text_16_7;

    @FXML
    private Text Text_16_8;

    @FXML
    private Text Text_16_9;

    @FXML
    private Text Text_17_1;

    @FXML
    private Text Text_17_10;

    @FXML
    private Text Text_17_11;

    @FXML
    private Text Text_17_12;

    @FXML
    private Text Text_17_13;

    @FXML
    private Text Text_17_14;

    @FXML
    private Text Text_17_15;

    @FXML
    private Text Text_17_16;

    @FXML
    private Text Text_17_17;

    @FXML
    private Text Text_17_18;

    @FXML
    private Text Text_17_19;

    @FXML
    private Text Text_17_2;

    @FXML
    private Text Text_17_20;

    @FXML
    private Text Text_17_3;

    @FXML
    private Text Text_17_4;

    @FXML
    private Text Text_17_5;

    @FXML
    private Text Text_17_6;

    @FXML
    private Text Text_17_7;

    @FXML
    private Text Text_17_8;

    @FXML
    private Text Text_17_9;

    @FXML
    private Text Text_18_1;

    @FXML
    private Text Text_18_10;

    @FXML
    private Text Text_18_11;

    @FXML
    private Text Text_18_12;

    @FXML
    private Text Text_18_13;

    @FXML
    private Text Text_18_14;

    @FXML
    private Text Text_18_15;

    @FXML
    private Text Text_18_16;

    @FXML
    private Text Text_18_17;

    @FXML
    private Text Text_18_18;

    @FXML
    private Text Text_18_19;

    @FXML
    private Text Text_18_2;

    @FXML
    private Text Text_18_20;

    @FXML
    private Text Text_18_3;

    @FXML
    private Text Text_18_4;

    @FXML
    private Text Text_18_5;

    @FXML
    private Text Text_18_6;

    @FXML
    private Text Text_18_7;

    @FXML
    private Text Text_18_8;

    @FXML
    private Text Text_18_9;

    @FXML
    private Text Text_19_1;

    @FXML
    private Text Text_19_10;

    @FXML
    private Text Text_19_11;

    @FXML
    private Text Text_19_12;

    @FXML
    private Text Text_19_13;

    @FXML
    private Text Text_19_14;

    @FXML
    private Text Text_19_15;

    @FXML
    private Text Text_19_16;

    @FXML
    private Text Text_19_17;

    @FXML
    private Text Text_19_18;

    @FXML
    private Text Text_19_19;

    @FXML
    private Text Text_19_2;

    @FXML
    private Text Text_19_20;

    @FXML
    private Text Text_19_3;

    @FXML
    private Text Text_19_4;

    @FXML
    private Text Text_19_5;

    @FXML
    private Text Text_19_6;

    @FXML
    private Text Text_19_7;

    @FXML
    private Text Text_19_8;

    @FXML
    private Text Text_19_9;

    @FXML
    private Text Text_1_1;

    @FXML
    private Text Text_1_10;

    @FXML
    private Text Text_1_11;

    @FXML
    private Text Text_1_12;

    @FXML
    private Text Text_1_13;

    @FXML
    private Text Text_1_14;

    @FXML
    private Text Text_1_15;

    @FXML
    private Text Text_1_16;

    @FXML
    private Text Text_1_17;

    @FXML
    private Text Text_1_18;

    @FXML
    private Text Text_1_19;

    @FXML
    private Text Text_1_2;

    @FXML
    private Text Text_1_20;

    @FXML
    private Text Text_1_3;

    @FXML
    private Text Text_1_4;

    @FXML
    private Text Text_1_5;

    @FXML
    private Text Text_1_6;

    @FXML
    private Text Text_1_7;

    @FXML
    private Text Text_1_8;

    @FXML
    private Text Text_1_9;

    @FXML
    private Text Text_20_1;

    @FXML
    private Text Text_20_10;

    @FXML
    private Text Text_20_11;

    @FXML
    private Text Text_20_12;

    @FXML
    private Text Text_20_13;

    @FXML
    private Text Text_20_14;

    @FXML
    private Text Text_20_15;

    @FXML
    private Text Text_20_16;

    @FXML
    private Text Text_20_17;

    @FXML
    private Text Text_20_18;

    @FXML
    private Text Text_20_19;

    @FXML
    private Text Text_20_2;

    @FXML
    private Text Text_20_20;

    @FXML
    private Text Text_20_3;

    @FXML
    private Text Text_20_4;

    @FXML
    private Text Text_20_5;

    @FXML
    private Text Text_20_6;

    @FXML
    private Text Text_20_7;

    @FXML
    private Text Text_20_8;

    @FXML
    private Text Text_20_9;

    @FXML
    private Text Text_2_1;

    @FXML
    private Text Text_2_10;

    @FXML
    private Text Text_2_11;

    @FXML
    private Text Text_2_12;

    @FXML
    private Text Text_2_13;

    @FXML
    private Text Text_2_14;

    @FXML
    private Text Text_2_15;

    @FXML
    private Text Text_2_16;

    @FXML
    private Text Text_2_17;

    @FXML
    private Text Text_2_18;

    @FXML
    private Text Text_2_19;

    @FXML
    private Text Text_2_2;

    @FXML
    private Text Text_2_20;

    @FXML
    private Text Text_2_3;

    @FXML
    private Text Text_2_4;

    @FXML
    private Text Text_2_5;

    @FXML
    private Text Text_2_6;

    @FXML
    private Text Text_2_7;

    @FXML
    private Text Text_2_8;

    @FXML
    private Text Text_2_9;

    @FXML
    private Text Text_3_1;

    @FXML
    private Text Text_3_10;

    @FXML
    private Text Text_3_11;

    @FXML
    private Text Text_3_12;

    @FXML
    private Text Text_3_13;

    @FXML
    private Text Text_3_14;

    @FXML
    private Text Text_3_15;

    @FXML
    private Text Text_3_16;

    @FXML
    private Text Text_3_17;

    @FXML
    private Text Text_3_18;

    @FXML
    private Text Text_3_19;

    @FXML
    private Text Text_3_2;

    @FXML
    private Text Text_3_20;

    @FXML
    private Text Text_3_3;

    @FXML
    private Text Text_3_4;

    @FXML
    private Text Text_3_5;

    @FXML
    private Text Text_3_6;

    @FXML
    private Text Text_3_7;

    @FXML
    private Text Text_3_8;

    @FXML
    private Text Text_3_9;

    @FXML
    private Text Text_4_1;

    @FXML
    private Text Text_4_10;

    @FXML
    private Text Text_4_11;

    @FXML
    private Text Text_4_12;

    @FXML
    private Text Text_4_13;

    @FXML
    private Text Text_4_14;

    @FXML
    private Text Text_4_15;

    @FXML
    private Text Text_4_16;

    @FXML
    private Text Text_4_17;

    @FXML
    private Text Text_4_18;

    @FXML
    private Text Text_4_19;

    @FXML
    private Text Text_4_2;

    @FXML
    private Text Text_4_20;

    @FXML
    private Text Text_4_3;

    @FXML
    private Text Text_4_4;

    @FXML
    private Text Text_4_5;

    @FXML
    private Text Text_4_6;

    @FXML
    private Text Text_4_7;

    @FXML
    private Text Text_4_8;

    @FXML
    private Text Text_4_9;

    @FXML
    private Text Text_5_1;

    @FXML
    private Text Text_5_10;

    @FXML
    private Text Text_5_11;

    @FXML
    private Text Text_5_12;

    @FXML
    private Text Text_5_13;

    @FXML
    private Text Text_5_14;

    @FXML
    private Text Text_5_15;

    @FXML
    private Text Text_5_16;

    @FXML
    private Text Text_5_17;

    @FXML
    private Text Text_5_18;

    @FXML
    private Text Text_5_19;

    @FXML
    private Text Text_5_2;

    @FXML
    private Text Text_5_20;

    @FXML
    private Text Text_5_3;

    @FXML
    private Text Text_5_4;

    @FXML
    private Text Text_5_5;

    @FXML
    private Text Text_5_6;

    @FXML
    private Text Text_5_7;

    @FXML
    private Text Text_5_8;

    @FXML
    private Text Text_5_9;

    @FXML
    private Text Text_6_1;

    @FXML
    private Text Text_6_10;

    @FXML
    private Text Text_6_11;

    @FXML
    private Text Text_6_12;

    @FXML
    private Text Text_6_13;

    @FXML
    private Text Text_6_14;

    @FXML
    private Text Text_6_15;

    @FXML
    private Text Text_6_16;

    @FXML
    private Text Text_6_17;

    @FXML
    private Text Text_6_18;

    @FXML
    private Text Text_6_19;

    @FXML
    private Text Text_6_2;

    @FXML
    private Text Text_6_20;

    @FXML
    private Text Text_6_3;

    @FXML
    private Text Text_6_4;

    @FXML
    private Text Text_6_5;

    @FXML
    private Text Text_6_6;

    @FXML
    private Text Text_6_7;

    @FXML
    private Text Text_6_8;

    @FXML
    private Text Text_6_9;

    @FXML
    private Text Text_7_1;

    @FXML
    private Text Text_7_10;

    @FXML
    private Text Text_7_11;

    @FXML
    private Text Text_7_12;

    @FXML
    private Text Text_7_13;

    @FXML
    private Text Text_7_14;

    @FXML
    private Text Text_7_15;

    @FXML
    private Text Text_7_16;

    @FXML
    private Text Text_7_17;

    @FXML
    private Text Text_7_18;

    @FXML
    private Text Text_7_19;

    @FXML
    private Text Text_7_2;

    @FXML
    private Text Text_7_20;

    @FXML
    private Text Text_7_3;

    @FXML
    private Text Text_7_4;

    @FXML
    private Text Text_7_5;

    @FXML
    private Text Text_7_6;

    @FXML
    private Text Text_7_7;

    @FXML
    private Text Text_7_8;

    @FXML
    private Text Text_7_9;

    @FXML
    private Text Text_8_1;

    @FXML
    private Text Text_8_10;

    @FXML
    private Text Text_8_11;

    @FXML
    private Text Text_8_12;

    @FXML
    private Text Text_8_13;

    @FXML
    private Text Text_8_14;

    @FXML
    private Text Text_8_15;

    @FXML
    private Text Text_8_16;

    @FXML
    private Text Text_8_17;

    @FXML
    private Text Text_8_18;

    @FXML
    private Text Text_8_19;

    @FXML
    private Text Text_8_2;

    @FXML
    private Text Text_8_20;

    @FXML
    private Text Text_8_3;

    @FXML
    private Text Text_8_4;

    @FXML
    private Text Text_8_5;

    @FXML
    private Text Text_8_6;

    @FXML
    private Text Text_8_7;

    @FXML
    private Text Text_8_8;

    @FXML
    private Text Text_8_9;

    @FXML
    private Text Text_9_1;

    @FXML
    private Text Text_9_10;

    @FXML
    private Text Text_9_11;

    @FXML
    private Text Text_9_12;

    @FXML
    private Text Text_9_13;

    @FXML
    private Text Text_9_14;

    @FXML
    private Text Text_9_15;

    @FXML
    private Text Text_9_16;

    @FXML
    private Text Text_9_17;

    @FXML
    private Text Text_9_18;

    @FXML
    private Text Text_9_19;

    @FXML
    private Text Text_9_2;

    @FXML
    private Text Text_9_20;

    @FXML
    private Text Text_9_3;

    @FXML
    private Text Text_9_4;

    @FXML
    private Text Text_9_5;

    @FXML
    private Text Text_9_6;

    @FXML
    private Text Text_9_7;

    @FXML
    private Text Text_9_8;

    @FXML
    private Text Text_9_9;

    @FXML
    void initialize() throws IOException {
        ArrayList<String> points = new ArrayList<>();

        InformationFileUpgrade informationFileUpgrade = new InformationFileUpgrade();
        informationFileUpgrade.getUpgradeFile();


        PointersFromFile pointersFromFile = new PointersFromFile();
        points = pointersFromFile.getPointers();
        ArrayList<Text> textArrayList = new ArrayList<>(List.of(Text_1_1, Text_1_2, Text_1_3, Text_1_4, Text_1_5
                , Text_1_6, Text_1_7, Text_1_8, Text_1_9, Text_1_10, Text_1_11, Text_1_12, Text_1_13, Text_1_14, Text_1_15
                , Text_1_16, Text_1_17, Text_1_18, Text_1_19, Text_1_20, Text_2_1, Text_2_2, Text_2_3, Text_2_4, Text_2_5
                , Text_2_6, Text_2_7, Text_2_8, Text_2_9, Text_2_10, Text_2_11, Text_2_12, Text_2_13, Text_2_14, Text_2_15
                , Text_2_16, Text_2_17, Text_2_18, Text_2_19, Text_2_20, Text_3_1, Text_3_2, Text_3_3, Text_3_4, Text_3_5
                , Text_3_6, Text_3_7, Text_3_8, Text_3_9, Text_3_10, Text_3_11, Text_3_12, Text_3_13, Text_3_14, Text_3_15
                , Text_3_16, Text_3_17, Text_3_18, Text_3_19, Text_3_20, Text_4_1, Text_4_2, Text_4_3, Text_4_4, Text_4_5
                , Text_4_6, Text_4_7, Text_4_8, Text_4_9, Text_4_10, Text_4_11, Text_4_12, Text_4_13, Text_4_14, Text_4_15
                , Text_4_16, Text_4_17, Text_4_18, Text_4_19, Text_4_20, Text_5_1, Text_5_2, Text_5_3, Text_5_4, Text_5_5
                , Text_5_6, Text_5_7, Text_5_8, Text_5_9, Text_5_10, Text_5_11, Text_5_12, Text_5_13, Text_5_14, Text_5_15
                , Text_5_16, Text_5_17, Text_5_18, Text_5_19, Text_5_20,Text_6_1, Text_6_2, Text_6_3, Text_6_4, Text_6_5
                , Text_6_6, Text_6_7, Text_6_8, Text_6_9, Text_6_10, Text_6_11, Text_6_12, Text_6_13, Text_6_14, Text_6_15
                , Text_6_16, Text_6_17, Text_6_18, Text_6_19, Text_6_20, Text_7_1, Text_7_2, Text_7_3, Text_7_4, Text_7_5,
                Text_7_6, Text_7_7, Text_7_8, Text_7_9, Text_7_10, Text_7_11, Text_7_12, Text_7_13, Text_7_14, Text_7_15
                , Text_7_16, Text_7_17, Text_7_18, Text_7_19, Text_7_20, Text_8_1, Text_8_2, Text_8_3, Text_8_4, Text_8_5
                , Text_8_6, Text_8_7, Text_8_8, Text_8_9, Text_8_10
                , Text_8_11, Text_8_12, Text_8_13, Text_8_14, Text_8_15
                , Text_8_16, Text_8_17, Text_8_18, Text_8_19, Text_8_20,
                Text_9_1, Text_9_2, Text_9_3, Text_9_4, Text_9_5
                , Text_9_6, Text_9_7, Text_9_8, Text_9_9, Text_9_10
                , Text_9_11, Text_9_12, Text_9_13, Text_9_14, Text_9_15
                , Text_9_16, Text_9_17, Text_9_18, Text_9_19, Text_9_20 ,
                Text_10_1, Text_10_2, Text_10_3, Text_10_4, Text_10_5
                , Text_10_6, Text_10_7, Text_10_8, Text_10_9, Text_10_10
                , Text_10_11, Text_10_12, Text_10_13, Text_10_14, Text_10_15
                , Text_10_16, Text_10_17, Text_10_18, Text_10_19, Text_10_20 ,
                Text_11_1, Text_11_2, Text_11_3, Text_11_4, Text_11_5
                , Text_11_6, Text_11_7, Text_11_8, Text_11_9, Text_11_10
                , Text_11_11, Text_11_12, Text_11_13, Text_11_14, Text_11_15
                , Text_11_16, Text_11_17, Text_11_18, Text_11_19, Text_11_20,
                Text_12_1, Text_12_2, Text_12_3, Text_12_4, Text_12_5
                , Text_12_6, Text_12_7, Text_12_8, Text_12_9, Text_12_10
                , Text_12_11, Text_12_12, Text_12_13, Text_12_14, Text_12_15
                , Text_12_16, Text_12_17, Text_12_18, Text_12_19, Text_12_20 ,
                Text_13_1, Text_13_2, Text_13_3, Text_13_4, Text_13_5
                , Text_13_6, Text_13_7, Text_13_8, Text_13_9, Text_13_10
                , Text_13_11, Text_13_12, Text_13_13, Text_13_14, Text_13_15
                , Text_13_16, Text_13_17, Text_13_18, Text_13_19, Text_13_20,
                Text_14_1, Text_14_2, Text_14_3, Text_14_4, Text_14_5
                , Text_14_6, Text_14_7, Text_14_8, Text_14_9, Text_14_10
                , Text_14_11, Text_14_12, Text_14_13, Text_14_14, Text_14_15
                , Text_14_16, Text_14_17, Text_14_18, Text_14_19, Text_14_20 ,
                Text_15_1, Text_15_2, Text_15_3, Text_15_4, Text_15_5
                , Text_15_6, Text_15_7, Text_15_8, Text_15_9, Text_15_10
                , Text_15_11, Text_15_12, Text_15_13, Text_15_14, Text_15_15
                , Text_15_16, Text_15_17, Text_15_18, Text_15_19, Text_15_20 ,
                Text_16_1, Text_16_2, Text_16_3, Text_16_4, Text_16_5
                , Text_16_6, Text_16_7, Text_16_8, Text_16_9, Text_16_10
                , Text_16_11, Text_16_12, Text_16_13, Text_16_14, Text_16_15
                , Text_16_16, Text_16_17, Text_16_18, Text_16_19, Text_16_20,
                Text_17_1, Text_17_2, Text_17_3, Text_17_4, Text_17_5
                , Text_17_6, Text_17_7, Text_17_8, Text_17_9, Text_17_10
                , Text_17_11, Text_17_12, Text_17_13, Text_17_14, Text_17_15
                , Text_17_16, Text_17_17, Text_17_18, Text_17_19, Text_17_20 ,
                Text_18_1, Text_18_2, Text_18_3, Text_18_4, Text_18_5
                , Text_18_6, Text_18_7, Text_18_8, Text_18_9, Text_18_10
                , Text_18_11, Text_18_12, Text_18_13, Text_18_14, Text_18_15
                , Text_18_16, Text_18_17, Text_18_18, Text_18_19, Text_18_20 ,
                Text_19_1, Text_19_2, Text_19_3, Text_19_4, Text_19_5
                , Text_19_6, Text_19_7, Text_19_8, Text_19_9, Text_19_10
                , Text_19_11, Text_19_12, Text_19_13, Text_19_14, Text_19_15
                , Text_19_16, Text_19_17, Text_19_18, Text_19_19, Text_19_20 ,
                Text_20_1, Text_20_2, Text_20_3, Text_20_4, Text_20_5
                , Text_20_6, Text_20_7, Text_20_8, Text_20_9, Text_20_10
                , Text_20_11, Text_20_12, Text_20_13, Text_20_14, Text_20_15
                , Text_20_16, Text_20_17, Text_20_18, Text_20_19, Text_20_20
        ));
for(int i = 0 ; i < points.size() ; i++){
    if(points.size()!=0){
        textArrayList.get(i).setText(points.get(i));
    }else{
        textArrayList.get(i).setText("Text");
    }
}
SavedInformationFile savedInformationFile = new SavedInformationFile();
savedInformationFile.getUpgradeFile();

saveButton.setOnAction(event->{
    RadioMenuItem adioItem ;
    PrintWriter writer = null ;
    try{
     writer = new PrintWriter("D:\\для проектов\\NoteBookAPP\\saved.txt");}
    catch (FileNotFoundException e){
        savedInformationFile.getUpgradeFile();
    }
if(Group1.getSelectedToggle()!=null){
    adioItem = ( RadioMenuItem) Group1.getSelectedToggle();
   Text text = (Text) adioItem.getGraphic();
   writer.println(text.getText());
}else{
writer.println("-----");
    }

    if(Group2.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group2.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group3.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group3.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group4.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group4.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group5.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group5.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group6.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group6.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group7.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group7.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group8.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group8.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group9.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group9.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group10.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group10.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group11.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group11.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group12.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group12.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group13.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group13.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group14.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group14.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group15.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group15.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group16.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group16.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group17.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group17.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group18.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group18.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group19.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group19.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }

    if(Group20.getSelectedToggle()!=null){
        adioItem = ( RadioMenuItem) Group20.getSelectedToggle();
        Text text = (Text) adioItem.getGraphic();
        writer.println(text.getText());
    }else{
        writer.println("-----");
    }


writer.close();


});
    }


}




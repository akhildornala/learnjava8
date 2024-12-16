package com.example.test;

import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateDailyNotesFile {
    public static void main(String[] args) {
        System.out.println("Welcome Akhil Dornala");
        System.out.println("going to create daily notes");
        try {
            String sourcePath = "C:/Users/TaraAkhil/Documents/notes/dailynotes";
            String todayAsString = new SimpleDateFormat("yyyyMMdd").format(new Date());
            System.out.println("date is " + todayAsString);
            String yearString = todayAsString.substring(0, 4);
            String monthString = todayAsString.substring(0, 6);
            String dateString = todayAsString.substring(0, 8);

            String yearPath = sourcePath + "/" + yearString;
            File yearFolder = new File(yearPath);
            if (!yearFolder.exists()) {
                yearFolder.mkdirs();
            }

            String monthPath = yearFolder.getAbsolutePath() + "/" + monthString;
            File monthFolder = new File(monthPath);
            if (!monthFolder.exists()) {
                monthFolder.mkdirs();
            }

            String datePath = monthFolder.getAbsolutePath() + "/" + dateString;
            File dateFolder = new File(datePath);
            if (!dateFolder.exists()) {
                dateFolder.mkdirs();
            }

            String dateFilePath = dateFolder.getAbsolutePath() + "/" + todayAsString + ".txt";
            File dateFile = new File(dateFilePath);
            if (!dateFile.exists()) {
                dateFile.createNewFile();
                System.out.println("file " + dateFilePath + " created");
            }

            String nppPath = "C:\\Program Files\\Notepad++\\notepad++.exe";
            String command = nppPath + " " + dateFilePath;
            System.out.println("going to open:" + dateFilePath);
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec(command);

            System.out.println("end");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String args[]) {
        List<String> ls = new ArrayList<>();
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Program Files\\Notepad++\\notepad++.exe C:\\Users\\doakhil\\Documents\\akhildornala\\work\\daily_notes\\2024\\202406\\20240607\\20240607.txt");

//            ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe", "C:\\Users\\doakhil\\Documents\\akhildornala\\work\\daily_notes\\2024\\202406\\20240607\\20240607.txt");
//            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

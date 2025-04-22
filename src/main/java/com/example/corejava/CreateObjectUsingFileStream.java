package com.example.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CreateObjectUsingFileStream {

    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\TaraAkhil\\Documents\\notes\\dailynotes\\2025\\202504\\20250422\\test5.txt";
            writeTOFile(filePath);
            readFromFile(filePath);
            readFromFile2(filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void writeTOFile(String filePath) {
        try {
            People p = new People(1, "man", 1000.0);
            FileOutputStream fout = new FileOutputStream(filePath);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(p);
            oout.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String filePath) {
        try {
            FileInputStream fin = new FileInputStream(filePath);
            ObjectInputStream oin = new ObjectInputStream(fin);
            People p = (People) oin.readObject();
            oin.close();
            fin.close();
            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile2(String filePath) {
        try(FileInputStream fin = new FileInputStream(filePath);ObjectInputStream oin = new ObjectInputStream(fin);) {
            People p = (People) oin.readObject();
            oin.close();
            fin.close();
            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

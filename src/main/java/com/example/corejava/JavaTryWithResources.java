package com.example.corejava;

import java.io.*;
import java.util.Scanner;

public class JavaTryWithResources {

    public static void main(String args[]) {
        System.out.println("Akhil Dornala");
        String filePath = "C:\\Users\\TaraAkhil\\Documents\\notes\\testnotes.txt";
        BufferedReader br = null;
        try {
            File file = new File(filePath);
            InputStream is = new FileInputStream(file);
            InputStreamReader ir = new InputStreamReader(is);
            br = new BufferedReader(ir);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println("done");
        System.out.println("lets try , try with resources");

        try (InputStream is = new FileInputStream(new File(filePath))) {
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(ir);
            String line;
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("end");

    }

}

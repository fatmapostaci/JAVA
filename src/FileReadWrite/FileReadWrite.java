package FileReadWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
         String path = "";

        createFile(path);
        getFileInfo(path);
        readFile(path);
        writeFile(path);
        readFile(path);
    }
    public static void getFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("file.lastModified() = " + file.lastModified());
            System.out.println("file.length() = " + file.length());
            System.out.println("file.canWrite() = " + file.canWrite());
            System.out.println("file.canRead() = " + file.canRead());
        }
    }

    public static void writeFile(String path) {
        try {
            FileWriter file = new FileWriter(path,true);
            BufferedWriter writer = new BufferedWriter(file);
            writer.newLine();
            writer.write("");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<String> readFile(String path) {
        File file = new File(path);
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                list.add( reader.nextLine() );
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void createFile(String path) {
        File file = new File((path));
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluştu");
            } else System.out.println("Dosya zaten mevcut");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

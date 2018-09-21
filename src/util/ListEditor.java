package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListEditor {

    private Scanner scanner;
    private PrintWriter writer;

    public ListEditor(String filePath) {
        File file = new File(filePath);

        try {
            scanner = new Scanner(file);
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeItem(String name, String price, String link) {
        writer.write(name + ":" + price + ":" + link);
    }

    public ArrayList<String> readList() {
        ArrayList<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }

}

package testfile;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\testfile\\daicent.txt");
        Scanner sc = new Scanner(file);
        String[] arr;
        while (sc.hasNext()) {
            arr = sc.nextLine().split(",");
            for (String i : arr) {
                System.out.println(i);
            }
        }
    }
}

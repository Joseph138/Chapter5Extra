/**
 * Student: Joseph Grados
 * Professor: Hyesung Park
 * Date: 10/20/2022
 * Class: ITEC 2150
 * Purpose: TO create an IO script to make the user read in the 10 numbers for the Book1.csv provided
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Reader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Book1.csv");
        try {
            Scanner sc = new Scanner(file);
            String s[];
            int min = 9999, max = 0, sum = 0;
            while (sc.hasNextLine()) {
                s = sc.nextLine().split(",");
                try {
                    for(String str : s) {
                        sum = sum + Integer.parseInt(str);
                        if (Integer.parseInt(str) < min) {
                            min = Integer.parseInt(str);
                        }
                        if (Integer.parseInt(str) > max) {
                            max = Integer.parseInt(str);
                        }
                    }
                }catch(NumberFormatException e){
                    System.out.println(e);
                }
            }

            int avg = (sum + min + max) / 3;

            FileWriter filewriter = new FileWriter("src/stats.txt");
            filewriter.write("The sum of the numbers is: " + sum + "\n");
            filewriter.write("The lowest number is: " + min + "\n");
            filewriter.write("The highest number is: " + max + "\n");
            filewriter.write("The average of the numbers is: " + avg + "\n");
            filewriter.close();
        }catch(FileNotFoundException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

    }
}

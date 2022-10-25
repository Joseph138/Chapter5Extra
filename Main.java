/**
 * Student:Joseph Grados
 * Professor: Hyesung Park
 * Date: 10/20/2022
 * Course: ITEC 2150
 * Purpose: A tester class for the Poem class
 */
package Poem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try{
            PrintWriter myWriter = new PrintWriter("poems.txt");
            Poem p1 = new Poem();
            p1.setName("We Real Cool");
            p1.setPoet("Gwendolyn Brooks");

            Poem p2 = new Poem();
            p2.setName("I Know Why the Caged Bird Sings");
            p2.setPoet("Maya Angelou");

            Poem p3 = new Poem();
            p3.setName("The Road Not Taken");
            p3.setPoet("Robert Frost");

            myWriter.print(p1.getName()+"\n");
            myWriter.print(p1.getPoet() + "\n");

            myWriter.print(p2.getName() + "\n");
            myWriter.print(p2.getPoet()+"\n");

            myWriter.print(p3.getName()+"\n");
            myWriter.print(p3.getPoet()+"\n");

            myWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

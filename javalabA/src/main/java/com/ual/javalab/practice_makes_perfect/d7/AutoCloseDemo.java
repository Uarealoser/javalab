package com.ual.javalab.practice_makes_perfect.d7;

import java.io.*;

public class AutoCloseDemo {
    public static void main(String[] args) {
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
                PrintStream printStream = new PrintStream(new FileOutputStream("a.txt"));
        ){
            bufferedReader.readLine();
            printStream.print("helloworld");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;
import console.Console;
import file.File;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in); //system.in отвечает за ввод в консоль.

        System.out.println("Please, enter 1 or 2 " + "\n" + "1 - read from file" + "\n" + "2 - read from console");

        int number = scanner.nextInt();
        while (number != 1 & number != 2) {   // если условие цикла истинно, то выполняется блок кода за условием. Если ложно, то цикл пропускается.
            System.out.println(number + " is not 1 or 2." + "\n" + "Please, enter only 1 or 2" + ": ");
            number = scanner.nextInt();
        }
        System.out.println("Your number is: " + number);

        if (number == 1) {
            System.out.println("Read from file");
        } else {
            System.out.println("Read from console");
        }
    }
}

/*
        String path = "D:/Java/test.txt"; //записываем в переменную путь до файла.
        File file = new File(path); //в скобках указываем путь до необходимого файла.
        Scanner scn = new Scanner(file); //можно считать все строки из этого файла.
        }
*/
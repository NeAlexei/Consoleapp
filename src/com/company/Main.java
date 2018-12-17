package com.company;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchElementException {

        Scanner scn = new Scanner(System.in); //system.in отвечает за считывание из консоли.
        System.out.println("MAKE YOUR CHOICE" + "\n" + "1 - read from file" + "\n" + "2 - read from console");

        int number = scn.nextInt();
        while (number !=1 & number !=2){ //
            System.out.println("Please, enter 1 or 2");
            number = scn.nextInt();
        }

        if(number==1){
            System.out.println("---Read from file---");

            String path = "E:/Test.txt"; //в переменную записываем путь до файла.
            File file = new File(path); //в скобках указываем путь до необходимого файла.
            Scanner scanner = new Scanner(file); //можно считать все строки из этого файла.
            System.out.println(scanner.nextLine());
        }
        else{
            System.out.println("---Read from console---" + "\n" + "Enter your text: ");

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println("Your text: " + " " + s);
        }
    }
}

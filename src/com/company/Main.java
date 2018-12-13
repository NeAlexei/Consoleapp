package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:/Java/test"; //в переменную записываем путь до файла.
        File file = new File(path); //в скобках указываем путь до необходимого файла.

        Scanner scn = new Scanner(file); //можно считать все строки из этого файла.

        Scanner scn = new Scanner(System.in); //system.in отвечает за ввод в консоль.
//        next(); считывает веденную строку и выводит ее до первого пробела
//        nextLine(); считывает всю введенную строку
//        nextInt(); считывает целочисленные значения
//        next

        System.out.println("");
        System.out.println("MAKE YOUR CHOICE");
        System.out.println("1 - read from file");
        System.out.println("2 - read from console");
        int number = scn.nextInt();

        if(number==1){
            System.out.println("Read from file");
        }
        else{
            System.out.println("Read from console");
        }
    }
}

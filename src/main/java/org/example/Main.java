package org.example;
import java.util.Scanner;
// Метод позволяющий определить, четное ли число поступило на входе
public class Main {
    public static void main(String[] args) {
        checkInt();
    }
    public static void checkInt(){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String info = (a % 2 == 0) ? "число четное" : "число не четное";
        System.out.println(info);
    }
}
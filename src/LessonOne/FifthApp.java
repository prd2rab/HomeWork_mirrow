package LessonOne;

import java.util.Scanner;

public class FifthApp {
    public static void main(String[] args){
        System.out.println("Вычисление высокосного года");
        System.out.println(" Введите год ");
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%400==0 || a%4==0 && a%100!=0){
            System.out.println(a + " - год  високосный");}
        else{
            System.out.println(a + " -год  невисокосный");}
    }
}

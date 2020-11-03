package LessonOne;

import java.util.Scanner;

public class SecondApp{
    public static void main(String[] args) {
        System.out.println("Определение суммы 2 чисел в диапозоне  от 10 до 20");
        System.out.println(" Введите целое число а ");
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(" Введите целое число b ");
        int b = scanner.nextInt();
        int result = a+b;
        System.out.println("Cумма a+b = " + result );
        if (result >= 10 && result<=20){
            System.out.println("True. Сумма лежит в пределах 10-20");
        }
        else {
            System.out.println(" False. Сумма не лежит в пределах 10-20");
        }
    }
}
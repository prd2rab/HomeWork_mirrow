package LessonOne;
import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args){
        System.out.println("Вычисление выражения a*(b+(c/d))");
        System.out.println(" Введите целое число а ");
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(" Введите целое число b ");
        int b = scanner.nextInt();
        System.out.println(" Введите целое число c ");
        int c = scanner.nextInt();
        System.out.println(" Введите целое число d ");
        int d = scanner.nextInt();
        float d0 = d;
        float result = a*(b+(c/d0));
        System.out.println("a = " +a + "; b = " +b + "; c = " +c +"; d = " +d );
        System.out.println("Выражение a*(b+(c/d)) = " + result );


    }
}

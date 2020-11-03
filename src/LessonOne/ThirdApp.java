package LessonOne;
import java.util.Scanner;
public class ThirdApp {
    public static void main(String[] args) {
        System.out.println("Проверка числа положительное или отрицательное " );
        System.out.println(" Введите целое число а ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        isPositiveOrNegative(a);
    }
    private static void isPositiveOrNegative(int a) {
        if (a >= 0){
            System.out.println("Число " + a + " - положительное");
        }
        else {
            System.out.println("Число " + a + " - отрицательное");}
    }
}

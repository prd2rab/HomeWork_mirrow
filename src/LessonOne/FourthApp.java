package LessonOne;

public class FourthApp {
    public static void main(String[] args) {
        System.out.println("Передача имени  ");
        String e = "Sasha";
        // System.out.println(e);
        methodName(e);
    }

    private static void methodName(String e1) {
        System.out.println("Привет, "  +e1 + "!");
    }
}
package LessonOne;

public class Lesson2HomeWork {
    public static void main(String [] args){
                 invertArray(); // инверсия 1 0 1 0 0 1//
                 System.out.println(" ");
                 fillArray();  // заполнение массива
                 System.out.println(" ");
                 changeArray(); // умножение на 2 числел меньше 6
                 System.out.println(" ");
                 MaximumMinimum();

    }

    private static void MaximumMinimum() {
        int[] arr4 = {10, 5, 3, 2, 11, 40, 5, 2, 4, 8, 9, 2};
        int maximum = arr4[0];
        int minimum = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > maximum) {
                maximum = arr4[i];
            }
            if (arr4[i] < minimum) {
                minimum = arr4[i];
            }
        }
        System.out.print("Максимум "+ maximum + " Минимум " + minimum);
    }

    private static void changeArray() {
        final int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            } else {
                arr3[i] = arr3[i];
            }
            System.out.print(arr3[i] + "  ");
        }
    }

    private static void fillArray() {
        int[] arr2 = new int[8];
         for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 3*i+1;     /// 3n + 1
        System.out.print(arr2[i] + "  ");
        }




    }

    // инверсия
    public static void invertArray() {
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            //   System.out.print(arr[i] +"  ");
            arr1[i] = (arr1[i] == 1) ? 0 : 1;
            System.out.print(arr1[i] + "  ");
        }


    }
}


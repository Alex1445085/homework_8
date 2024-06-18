import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

 // 1.
        int index;
        System.out.println("\n1.");
        int [] arrayFirst = new int [3];
        for (index = 0; index < arrayFirst.length; index++) {
            arrayFirst[index] = index + 1;
        }
        float [] arraySecond = {1.57f, 7.654f, 9.986f};
        int [] arrayThird = new int [15];
        for (index = 0; index < arrayThird.length; index++) {
            arrayThird[index] = 10 + index * 3;
        }

 // 2.
        System.out.println("\n2.");
        for (index = 0; index < arrayFirst.length; index++) {
            System.out.print(arrayFirst[index]);
            if (index < arrayFirst.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
        for (index = 0; index < arraySecond.length; index++) {
            System.out.print(arraySecond[index]);
            if (index < arraySecond.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
        for (index = 0; index < arrayThird.length; index++) {
            System.out.print(arrayThird[index]);
            if (index == arrayThird.length - 1) {
                System.out.println();
            }
            else {
                System.out.print(", ");
            }
        }

 // 3.
        System.out.println("\n3.");
        for (index = arrayFirst.length - 1; index >= 0; index--) {
            System.out.print(arrayFirst[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (index = arraySecond.length - 1; index >= 0; index--) {
            System.out.print(arraySecond[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (index = arrayThird.length - 1; index > 0; index--) {
            System.out.print(arrayThird[index] + ", ");
        }
        System.out.println(arrayThird[0]);

 // 4.
        System.out.println("\n4.");
        for (index = 0; index < arrayFirst.length; index++) {
            if (arrayFirst[index] % 2 != 0) {
                arrayFirst[index] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayFirst));
    }
}
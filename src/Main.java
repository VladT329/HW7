import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;
        double[] threeFractionalNumbers = {1.57, 7.654, 9.986};
        int[] arbitraryArray = {4, 5, 6};
        System.out.println("Смотри код");
        System.out.println();

        System.out.println("Задание 2");
        for (int i = 0; i < oneTwoThree.length; i++) {
            if (i < 2) {
                System.out.print(oneTwoThree[i] + ", ");
            } else if (i == 2) {
                System.out.print(oneTwoThree[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < threeFractionalNumbers.length; i++) {
            if (i < 2) {
                System.out.print(threeFractionalNumbers[i] + ", ");
            } else if (i == 2) {
                System.out.print(threeFractionalNumbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arbitraryArray.length; i++) {
            if (i < 2) {
                System.out.print(arbitraryArray[i] + ", ");
            } else if (i == 2) {
                System.out.print(arbitraryArray[i]);
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 3");
        for (int i = 2; i > 0; i--) {
            System.out.print(oneTwoThree[i] + ", ");
        }
        System.out.print(oneTwoThree[0]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(threeFractionalNumbers[i] + ", ");
        }
        System.out.print(threeFractionalNumbers[0]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(arbitraryArray[i] + ", ");
        }
        System.out.print(arbitraryArray[0]);
        System.out.println();
        System.out.println();

        System.out.println("Задание 4");
        for (int i = 0; i < oneTwoThree.length; i++) {
            if ((oneTwoThree[i] % 2) != 0) {
                oneTwoThree[i] = oneTwoThree[i] + 1;
            }
        }
        System.out.println(Arrays.toString(oneTwoThree));
    }
}
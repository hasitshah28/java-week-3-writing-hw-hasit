package homework_week_7;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are : ");
        for (int i = 1; i <= 100; i++) {
            divideByThree(i);
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Numbers divisible by 5 are : ");
        for (int i = 1; i <= 100; i++) {
            divideByFive(i);
        }
    }

    //Divided by three method
    public static void divideByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " , ");
        }
    }

    //Divided by five method
    public static void divideByFive(int number) {
        if (number % 5 == 0) {
            System.out.println(number + " , ");

        }
    }
}


import org.junit.jupiter.api.Test;

/**
 * This class was created for learningn purposes.
 * Students will learn basics of GIT with it
 *
 * @author Alex Ryzhkov
 */

public class Main {

    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();

        lesson1.Divider();
        lesson1.Substrackt();

        int num1 = 1;
        int num2 = 2;

        System.out.println("Hello calculator program");
        int sum = sum(num1,num2);
        int mmultiply = multiply(num1,num2);
        System.out.println("Sum is: " + sum + "; multiplication result is: " + mmultiply);
        System.out.println("Subtraction is: " + substruct(2,3) + "; Division is: " + divide(1,2));
    }

    public static int sum(int i1, int i2){
        return i1 + i2;
    }

    public static int multiply(int i1, int i2) {
        return i1 * i2;
    }

    public static int substruct(int i1, int i2) {
        return i1 - i2;
    }

    public static int divide(int i1, int i2) {
        return i1 / i2;
    }
}

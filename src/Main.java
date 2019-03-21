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

        System.out.println("Hello calculator program");
        int sum = sum(1,2);
        int mmultiply = multiply(4,3);
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

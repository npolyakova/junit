import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = 0;

        try {
             num = sc.nextByte();
             System.out.println(num);
        }
        catch (InputMismatchException e) {
            System.out.println("Введено не число");
        }
        finally {
            System.out.println("Здесь есть try catch");
        }

        System.out.println(num + 1);
    }
}

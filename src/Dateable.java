import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age; ");
        int age = scanner.nextInt ();
        int agetwo = age/2+7;
        System.out.println( age + "-years old olds should date somebody who is at least " + agetwo + "-years old");




    }
}

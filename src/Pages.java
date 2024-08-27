import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age; ");
        int age = scanner.nextInt ();
        int agetwo = 100-age;
        System.out.println( age + "-years old olds should date somebody who is at least " + agetwo + "-years old");
    }
}

import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age; ");
        int age = scanner.nextInt ();
        int pages = 100-age;
        System.out.println( age + "-years old olds should read at least " + pages + " pages before giving up on a book.");
    }
}

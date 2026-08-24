package Hello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
<<<<<<< HEAD
        String name=scanner.nextLine();
        System.out.println("hello "+name);
=======
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
>>>>>>> 75c527523ecc14199546e9fdd71db9b35eed9612
    }
}

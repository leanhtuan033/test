package Hello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("hello "+name); 
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Hi! What is your name?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("HELLO AND WELCOME," + s);
    }
}

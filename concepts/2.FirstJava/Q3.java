import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Pls Enter Principal,Time and Rate");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int si = (p*t*r)/100;
        System.out.println(si);


    }
}

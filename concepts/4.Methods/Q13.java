import java.util.Scanner;
public class Q13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, count = 0;
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt();
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
        func();
        public void func{
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            count = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (count == 1)
                System.out.println(i);
        }
        }
    }
}

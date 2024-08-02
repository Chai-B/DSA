import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while(true){
            System.out.println("Enter shape: ");
            String sel = sc.next();
            if (sel.equals("Circle")){
                System.out.println("Enter Radius of Circle");
                double r = sc.nextDouble();
                ans = 3.14*r*r;
            }
            if (sel.equals("Triangle")) {
                System.out.println("Enter Base and Height of Triangle");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                ans = 0.5 * b * h;
            }
            if (sel.equals("Square")) {
                System.out.println("Enter edge");
                double s = sc.nextDouble();
                ans = s*s;
            }
            if (sel.equals("Rectangle")) {
                System.out.println("Enter width and height");
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                ans = w*h;
            }
            if (sel.equals("Parallelogram")) {
                System.out.println("Enter base and height");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                ans = b*h;
            }
            if (sel.equals("Rhombus")) {
                System.out.println("Enter base and height");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                ans = b * h;
            }
            System.out.println(ans);
        }
    }
}

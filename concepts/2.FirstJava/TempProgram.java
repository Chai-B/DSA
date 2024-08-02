import java.sql.SQLOutput;
import java.util.Scanner;

public class TempProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        float tempc = input.nextFloat() ;
        float tempf = (tempc * 9/5) +32;
        System.out.println(tempf);

    }
}

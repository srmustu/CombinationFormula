import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        // n faktöriyel hesaplama
        int value,total;
        String message1,message2;

        total = 1;
        message1 = "Enter the number you want the factorial to be calculated from : ";
        message2 = "Result : ";

        System.out.print(message1);
        value = entry.nextInt();

        for (int i = 1; i <= value; i++){
            total *= i;
        }
        System.out.println(message2 + total);

    }
}

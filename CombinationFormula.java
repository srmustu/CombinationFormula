import java.util.Scanner;
public class CombinationFormula {
    public static void main(String[] args) {
        /*
        ilk sayı faktöriyel bölü 2.sayı faktöriyel x ilk sayı - ikinci sayı

         */


        Scanner entry = new Scanner(System.in);
        String message1,message2,message3;
        long num1,num2,total1,total2,calculator1,calculator2,totalFormula;

        message1 = "Enter first number : ";
        message2 = "Enter second number : ";
        message3 = "Combination result : ";

        total1 = 1;
        total2 = 1;

        System.out.print(message1);
        num1 = entry.nextInt();
        System.out.print(message2);
        num2 = entry.nextInt();

        for (int i = 1; i <= num1; i++){
            total1 = total1 * i;
        }

        for (int j = 1; j <= num2; j++){
            total2 = total2 * j;
        }

        calculator1 = num1 - num2;
        calculator2 = calculator1 * total2;
        totalFormula = total1 / calculator2;

        System.out.println(message3 + totalFormula);
    }
}

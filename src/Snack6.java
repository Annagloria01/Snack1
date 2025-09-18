
import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero= scanner.nextInt();

       for (int i = 1; i <= numero; i++) {
        int cubo= (int) Math.pow(i, 3);

        System.out.println("il cubo di "+ i + " è "+ cubo);
           
       }
           
       }

}

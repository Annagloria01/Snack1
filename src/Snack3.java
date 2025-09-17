
import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int somma=0;
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("Inserisci un numero");
            int  numero=scanner.nextInt();
            somma+=numero;

        }
        System.out.println("La somma di tutti i numeri è " + somma);
    }

}

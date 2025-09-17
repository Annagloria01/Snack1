
import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numeroA = scanner.nextInt();
        System.out.println("Inserisci un secondo numero");
        int numeroB = scanner.nextInt();

        if(numeroA>numeroB){
            System.out.println("il numero maggiore è " + numeroA);

        }else {
            System.out.println("Il numero magggiore è " + numeroB);
        }


    }

}

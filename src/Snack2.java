
import java.util.Scanner;

public class Snack2 {
 public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
     System.out.println("Inserisci una parola");
     String parola1= scanner.nextLine();
     System.out.println("Inserisci un altra parola");
     String parola2= scanner.nextLine();

     if(parola1.length()> parola2.length()){
        System.out.println("La parola più lunga è "+ parola1);

     }else {
        System.out.println("La parola più lunga è "+ parola2);
     }
 }
}

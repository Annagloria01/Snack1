
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        String [] invitati={"Nick Carraway", "Tom Buchanan", "Jordan Baker", "George Wilson"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci il tuo nome per la festa");
        String nomeInvitato= scanner.nextLine();

       
        for (int i = 0; i < invitati.length; i++) {
            String currentElement= invitati[i];

            if(currentElement.equalsIgnoreCase(nomeInvitato)){
                System.out.println("Puoi entrare");
                return;
            }
                
            }
            System.out.println("Non puoi entrare");
            
        }
    }



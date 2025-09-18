public class Snack7 {
    public static void main(String[] args) {

        int base = 2;
        int esponente = 0;

        int risultato = 0;

        while((int) Math.pow(base, esponente) < 1000){
            risultato = (int) Math.pow(base, esponente);
            esponente++;

            System.out.println("La potenza di "+ base + "^" + esponente + " = " + risultato);
        }
    }
}

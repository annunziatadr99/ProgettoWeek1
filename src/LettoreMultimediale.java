import java.util.Scanner;
public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multimediale[] elementi = new Multimediale[5];

        elementi[0] = new Immagine("Via Partenope", 3);
        elementi[1] = new Audio("Totò - La livella", 6, 4);
        elementi[2] = new Video("Pino Daniele - Napul'è", 4, 8, 5);
        elementi[3] = new Immagine("Piazza del Plebiscito", 2);
        elementi[4] = new Audio("Massimo Troisi - Poesia, o ssaje comme fa o'core", 8, 4);

        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Scegli un elemento da eseguire - (Premi il tasto 0 per uscire)");
            for (int i = 0; i < elementi.length; i++) {
                if (elementi[i] != null) {
                    System.out.println((i + 1) + " " + elementi[i].getTitolo());
                }
            }
            String inputLine = input.next();
            if (isNumeric(inputLine)) {
                scelta = Integer.parseInt(inputLine);
                if (scelta > 0 && scelta <= elementi.length) {
                    Multimediale elem = elementi[scelta - 1];
                    if (elem instanceof Riproduttore) {
                        ((Riproduttore) elem).play();
                    } else if (elem instanceof Immagine) {
                        ((Immagine) elem).show();
                    }
                } else if (scelta != 0) {
                    System.out.println("Scelta non valida");
                }
            } else {
                System.out.println("Scelta non valida");
            }
            System.out.println();
        }
        input.close();
    }
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
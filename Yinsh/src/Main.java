import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Game spiel = new Game();

        startPlatzierung(spiel);
    }

    public static void startPlatzierung(Game spiel) {
        char nextRingChar;
        int nextRingInt;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) System.out.println("Weiß bitte eingeben: ");
            else System.out.println("Schwarz bitte eingeben: ");

            String s = scanner.nextLine();
            nextRingInt = Integer.parseInt(s.substring(1));
            nextRingChar = s.charAt(0);
            EinzelFeld platzierFeld = new EinzelFeld(nextRingChar, nextRingInt);

            for (EinzelFeld e : spiel.feld.keySet()) {
                if (platzierFeld.zahl == e.zahl && platzierFeld.buchstabe == e.buchstabe) {
                    if(spiel.feld.get(e)==FeldStatus.leer){
                        if(i % 2 == 0)spiel.feld.put(e, FeldStatus.weissRing);
                        else spiel.feld.put(e, FeldStatus.schwarzRing);
                    }
                    else System.out.println("Das Feld ist besetzt");
                    break;
                }
            }
        }

        for (EinzelFeld einzelFeld : spiel.feld.keySet()) {
            System.out.println(einzelFeld.buchstabe + "" + einzelFeld.zahl + ": " + spiel.feld.get(einzelFeld));
        }
    }
}


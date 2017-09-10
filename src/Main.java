import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Game spiel = new Game();
        Player weiss = new Player();
        Player schwarz = new Player();

        startPlatzierung(spiel, weiss, schwarz);
    }

    public static void startPlatzierung(Game spiel, Player weiss, Player schwarz){
        char nextRingChar;
        int nextRingInt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe ein Feld ein");
        for(int i = 0; i<10; i++) {
            if (i % 2 == 0) {
                System.out.println("Weiß bitte eingeben: ");
                while (true) {
                    nextRingInt = Integer.parseInt(scanner.nextLine());
                    nextRingChar = scanner.nextLine().charAt(0);
                    if (spiel.feld.get(new EinzelFeld(nextRingInt, nextRingChar)) == FeldStatus.leer) {
                        spiel.feld.put(new EinzelFeld(nextRingInt, nextRingChar), FeldStatus.weissRing);
                        weiss.ringe+=1;
                        break;
                    } else System.out.println("Das Feld ist schon belegt");
                }
            } else {
                System.out.println("Schwarz bitte eingeben: ");
                while (true) {
                    nextRingInt = Integer.parseInt(scanner.nextLine());
                    nextRingChar = scanner.nextLine().charAt(0);
                    if (spiel.feld.get(new EinzelFeld(nextRingInt, nextRingChar)) == FeldStatus.leer) {
                        spiel.feld.put(new EinzelFeld(nextRingInt, nextRingChar), FeldStatus.weissRing);
                        weiss.ringe+=1;
                        break;
                    } else System.out.println("Das Feld ist schon belegt");
                }
            }
        }
        for(EinzelFeld einzelFeld: spiel.feld.keySet() )
        {
            System.out.println(einzelFeld + ": "+ spiel.feld.get(einzelFeld));
        }
    }
}

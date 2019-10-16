import java.util.Scanner;

public class GuessNr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbę");
            int number = input.nextInt();
            if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Twoja liczba jest ok");
                break;
            }
        } while (true);
        input.close();
    }
}
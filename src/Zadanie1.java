import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj ciag znakow");
        String nazwa = skaner.nextLine();
        System.out.println("Podaj miejsce w ciagu");
        int miejsce = skaner.nextInt();
        System.out.println(showChar(nazwa,miejsce-1));
    }
    public static char showChar(String nazwa , int miejsce)
    {
        char wynik= nazwa.charAt(miejsce);
        return wynik;
    }
}

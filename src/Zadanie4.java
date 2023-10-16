import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("podaj czas spadania");
        double czas = skaner.nextDouble();
        System.out.println("obiekt przelecial odleglos: "+fallingDistance(czas));
    }
    public static double fallingDistance(double czas)
    {
        double odleglosc = 0.5*9.8*czas*czas;
        return odleglosc;
    }
}

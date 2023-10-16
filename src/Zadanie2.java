import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj cene produktu");
        double cena = skaner.nextDouble();
        System.out.println("podaj marze w porcentach");
         double marza = skaner.nextDouble();
        System.out.println(calculateRetail(cena,marza));
    }
    public static double calculateRetail(double cena,double marza)
    {
     double wynik=cena+(cena*(marza*0.01));
     return wynik;
    }
}

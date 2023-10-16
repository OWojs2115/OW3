import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        int wybor=0;
        int metry=0;
        Scanner skaner = new Scanner(System.in);
        System.out.println("wybierz opcje");
        System.out.println("konwersja na kilometry-1");
        System.out.println("konwersja na cale-2");
        System.out.println("konwersja na stopy-3");
        System.out.println("wyjscie-4");
        wybor=skaner.nextInt();
        if(wybor==1)
        {
            System.out.println("podaj ilosc metrow");
            metry=skaner.nextInt();
showKilometers(metry);
        }
        else if(wybor==2)
        {
            System.out.println("podaj ilosc metrow");
            metry=skaner.nextInt();
            showInches(metry);
        }
        else if(wybor==3)
        {
            System.out.println("podaj ilosc metrow");
            metry=skaner.nextInt();
            showFeet(metry);

        }
        else if(wybor==4)
        {
           System.exit(0);

        }
    }
    public static void showKilometers(int metry)
    {
     double kilometry=metry*0.001;
        System.out.println("kilometry: "+kilometry);
    }
    public static void showInches(int metry)
    {
 double cale = metry * 39.37;
        System.out.println("cale: "+cale);
    }
    public static void showFeet(int metry)
    {
 double feet = metry*3.281;
        System.out.println("stopy: "+feet);
    }
}

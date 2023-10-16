import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj ilosc pokoi");
        int liczbaPokoi = skaner.nextInt();
        System.out.println("podaj cene za litr");
        double cenaFarby = skaner.nextDouble();
        System.out.println("podaj powierzchnie");
        double powierzchnia = skaner.nextDouble();
        System.out.println("liczba godzin: "+godziny(powierzchnia,liczbaPokoi));
        System.out.println("liczba litrow farby: " +iloscFarby(powierzchnia,liczbaPokoi));
        System.out.println("koszt farby: " +kosztFarby(cenaFarby,powierzchnia,liczbaPokoi));
        System.out.println("koszt pracy : "+ kosztpracy(powierzchnia,liczbaPokoi));
        double lacznykoszt = kosztFarby(cenaFarby,powierzchnia,liczbaPokoi)+kosztpracy(powierzchnia,liczbaPokoi);
        System.out.println("łączny koszt: "+lacznykoszt);
    }
    public static double godziny(double powierzchnia,int iloscPokoi)
    {

        double iloscGodzinNam = 0.8*powierzchnia*iloscPokoi;
        return iloscGodzinNam;

    }
    public  static double iloscFarby(double powierzchnia,int iloscPokoi)
    {
        double iloscfarbynam = 0.15*powierzchnia*iloscPokoi;
        return  iloscfarbynam;

    }
    public static double kosztFarby(double cenaFarby,double powierzchnia,int iloscpokoi)
    {
       double kosztf= cenaFarby*iloscFarby(powierzchnia,iloscpokoi);
       return kosztf;
    }
    public static double kosztpracy(double powierzchnia,int iloscpokoi)
    {
       double cenapracy=godziny(powierzchnia,iloscpokoi)*18;
       return cenapracy;
    }
}

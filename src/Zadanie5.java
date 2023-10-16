import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        System.out.println("pdoaj stopnie fahrenheita");
        double fahrenheit = skaner.nextDouble();
        System.out.println("stopnie :" + celsius(fahrenheit));
    }
    public static double celsius(double fahrenheit)
    {
      double stopnie = (fahrenheit-32)/1.8;
      return stopnie;
    }
}

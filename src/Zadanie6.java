import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        double [] tablica = new double[5];
        Scanner skaner = new Scanner(System.in);
    for(int i =0;i<tablica.length;i++)
    {
        System.out.println("podaj wynik testu: ");
        tablica[i]=skaner.nextDouble();
    }
        System.out.println(calcAverage(tablica));
    }
    public static double calcAverage(double []tablica)
    {
      double average = (tablica[0]+tablica[1]+tablica[2]+tablica[3]+tablica[4])/5;
      return average;
    }
    public static double determineGrade(double []tablica)
    {
        int ocena=1;
      for (int i =0;i<5;i++)
      {
          if(tablica[i]>90)
          {
              ocena= 5;
          }
      else if(tablica[i]<89&&tablica[i]>=80)
          {
            ocena= 4;
          }
          else if(tablica[i]<79&&tablica[i]>=70)
          {
              ocena= 3;
          }
          else if(tablica[i]<69&&tablica[i]>=60)
          {
              ocena= 2;
          }
          else
          {
              ocena= 1;
          }

    }

      return ocena;
    }
}

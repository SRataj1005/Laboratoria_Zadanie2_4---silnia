import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int a = nowy.nextInt();
    int iloczyn = 1;
    for(int i = 1; i <= a; i++)
      {
        System.out.print(iloczyn + " * " + i + " = ");
        iloczyn = iloczyn * i;
        System.out.print(iloczyn); System.out.println();
      }
    System.out.println("Silnia z podanej liczby: "+iloczyn);
  }
}
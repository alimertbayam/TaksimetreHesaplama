import java.util.Scanner;

public class Taksimetre
{
    public static void main(String[] args) {
        double km, toplam;
        double baslangic=10;
        double kmUcret=2.2;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi Km Cinsinden Giriniz. :");
        km = input.nextInt();

        toplam = baslangic + (km*kmUcret);

        toplam = (toplam < 20) ? 20 : toplam;

        System.out.println("Toplam Tutar:" + toplam);
    }
}

import java.util.Scanner;

public class UsluSayilar {

    static int ushesapla(int sayi, int us){
        if(us == 0){
            return 1;
        }

        return sayi * ushesapla(sayi,us-1);
    }

    public static void main(String[] args) {
        int sayi,us;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        sayi = inp.nextInt();
        System.out.print("Üs değerini girin: ");
        us = inp.nextInt();

        System.out.print("Sonuç : " + ushesapla(sayi,us));
    }
}

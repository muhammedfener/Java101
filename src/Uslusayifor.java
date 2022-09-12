import java.util.Scanner;

public class Uslusayifor {
    public static void main(String[] args) {
        int taban,us,sonuc = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Taban sayıyı girin: ");
        taban = inp.nextInt();
        System.out.print("Üs sayıyı girin: ");
        us = inp.nextInt();

        for(int i=1;i<=us;i++){
            sonuc *= taban;
        }
        System.out.print("Sonuç: " + sonuc);
    }
}

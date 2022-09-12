import java.util.Scanner;

public class Harmoniksayi {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        sayi = inp.nextInt();

        for(int i=1;i<=sayi;i++){
            toplam += 1.0/i;
        }
        System.out.print("Sonuç: " + toplam);
    }
}

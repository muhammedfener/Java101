import java.util.Scanner;

public class Basamaktoplama {
    public static void main(String[] args) {
        int sayi,temp,toplam = 0,basamak;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        sayi = inp.nextInt();
        temp = sayi;
        while (temp>0){
            basamak = temp % 10;
            toplam += basamak;
            temp = temp / 10;
        }
        System.out.print("Basamakların Toplamı: " + toplam);
    }
}

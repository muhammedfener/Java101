import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        int girilensayi, temp, basamak, sonuc = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        girilensayi = inp.nextInt();
        temp = girilensayi;
        while(temp !=0){
            basamak = temp % 10;
            temp /= 10;
            sonuc = sonuc*10 + basamak;
        }
        System.out.print("Terse Çevrilmiş Hali: " + sonuc);
    }
}

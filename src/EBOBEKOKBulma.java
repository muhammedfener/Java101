import java.util.Scanner;

public class EBOBEKOKBulma {

    public static int ebobBul(int sayi1,int sayi2){
        int bolen = 1,sonuc = 1;
        while(sayi1>=bolen || sayi2>=bolen){
            if(sayi1%bolen == 0 && sayi2%bolen == 0){
                sonuc = bolen;
            }
            bolen++;
        }
        return sonuc;
    }

    public static int ekokBul(int sayi1, int sayi2){

        return (sayi1*sayi2)/ebobBul(sayi1,sayi2);
    }

    public static void main(String[] args) {
        int num1, num2, secim;

        Scanner inp = new Scanner(System.in);
        System.out.print("1-EBOB Bulma\n" +
                "2-EKOK Bulma\n" +
                "Yapacağınız İşlemi Seçin:");
        secim = inp.nextInt();
        System.out.print("Birinci Sayıyı Girin: ");
        num1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        num2 = inp.nextInt();

        switch (secim){
            case 1:
                System.out.print("En Büyük Ortak Bölen: " + ebobBul(num1,num2));
                break;
            case 2:
                System.out.print("En Küçük Ortak Kat: " + ekokBul(num1,num2));
                break;
            default:
                System.out.print("1 veya 2 dışında bir sayı girdiniz.");
                break;
        }
    }
}

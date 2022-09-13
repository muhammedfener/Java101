import java.util.Scanner;

public class Maxveminbul {
    public static void main(String[] args) {
        int sayi,min = 0,max = 0,kacsayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        kacsayi = inp.nextInt();

        for(int i=1;i<=kacsayi;i++){
            System.out.print(i +". Sayıyı Girin: ");
            sayi = inp.nextInt();

            if(i == 0){
                max = sayi;
                min = sayi;
            }
            if(sayi>max){
                max = sayi;
            }
            if(sayi<min){
                min = sayi;
            }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.print("En Küçük Sayı: " + min);
    }
}

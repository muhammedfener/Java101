import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,sayilartoplami = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        sayi = inp.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i == 0){
                sayilartoplami += i;
            }
        }
        if(sayi == sayilartoplami){
            System.out.print(sayi + " Mükemmel sayıdır.");
        }else{
            System.out.print(sayi + " Mükemmel sayı değildir.");
        }
    }
}

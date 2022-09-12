import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int teksayi;
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.print("Bir tek sayı girin: ");
            teksayi = inp.nextInt();
            if(teksayi%2 == 0){
                System.out.print("Girdiğiniz sayı tek sayı değil. Tekrar deneyin.");
                continue;
            }
        }
    }
}

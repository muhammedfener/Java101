import java.util.Scanner;
import java.util.Arrays;

public class ArrayElemanSirala {
    public static void main(String[] args) {
        int n,sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin: ");
        n = inp.nextInt();
        int[] sayilar = new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1) + ". Elemanı: ");
            sayilar[i] = inp.nextInt();
        }
        System.out.print("Sıralama: " + Arrays.toString(sayilar));
    }
}

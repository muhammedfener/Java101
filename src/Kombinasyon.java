import java.util.Scanner;

public class Kombinasyon {
    public static int factorial(int Num){
        int fact = 1;
        for(int i=1;i<=Num;i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int n,r,kombinasyon;
        Scanner inp = new Scanner(System.in);
        System.out.print("Küme boyutunu girin: ");
        n = inp.nextInt();
        System.out.print("Eleman sayısını girin: ");
        r = inp.nextInt();

        kombinasyon = factorial(n)/(factorial(r) * factorial(n-r));
        System.out.print("Sonuç: " + kombinasyon);

    }
}

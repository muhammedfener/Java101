import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        a = inp.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        b = inp.nextInt();
        System.out.print("Üçüncü Sayıyı Girin: ");
        c = inp.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.print("a > b > c");
            }
            else{
                System.out.print("a > c > b");
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.print("b > a > c");
            }
            else{
                System.out.print("b > c > a");
            }
        }else{
            if(a>b){
                System.out.print("c > a > b");
            }
            else{
                System.out.print("c > b > a");
            }
        }
    }
}

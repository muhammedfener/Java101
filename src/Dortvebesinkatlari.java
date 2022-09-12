import java.util.Scanner;

public class Dortvebesinkatlari {
    public static void main(String[] args) {
        int girilensayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        girilensayi = inp.nextInt();

        for(int i=0;i<girilensayi;i++){
            for(int j=0;j<5;j++){
                if(i == Math.pow(4,j)){
                    System.out.println(Math.pow(4,j));
                }
                if(i == Math.pow(5,j)){
                    System.out.println(Math.pow(5,j));
                }
            }
        }
    }
}

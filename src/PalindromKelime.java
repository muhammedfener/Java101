import java.util.Scanner;

public class PalindromKelime {
    static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "Kelime Palindrom Değil.";
            i++;
            j--;
        }
        return "Kelime Palindrom.";
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String kelime;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelimeyi Girin: ");
        kelime = inp.next();
        System.out.println(isPalindrome(kelime));
    }

}

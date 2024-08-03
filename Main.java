import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(in);
        out.print("Lutfen Bir Sayi Giriniz :");
        int n = inp.nextInt();
        int toplam = 0;
        for (int i = 1; i < n; i++) {
           if (n%i == 0 ) {
               toplam += i;
              //out.println(toplam); ile carpanlari gorebiliriz.
               }

            }
        if (toplam == n) {
            out.println("Mukemmel Sayidir.");
        }else{
            out.println("Mukemmel Sayi Degildir.");
        }

    }
}


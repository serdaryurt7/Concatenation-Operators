package ders05_Concatenation_Operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayı alın
        //eğer birinci sayı 100 den büyük ise, "ilk sayı 100'den büyük" yazdırın.
        //eğer ikinci sayı çiftse, "ikinci sayı çift" yazdırın.
        //eğer ilk sayı, ikinci sayıdan büyükse, "ilk sayı daha büyük" yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();

        if (sayi1>100){
            System.out.println("ilk sayı 100'den büyük");
        }

        if (sayi2 % 2 == 0) {
            System.out.println("ikinci sayı çift");
        }

        if (sayi1>sayi2) {
            System.out.println("ilk sayı daha büyük");
        }
    }
}

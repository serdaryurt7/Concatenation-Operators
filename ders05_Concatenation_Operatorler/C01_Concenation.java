package ders05_Concatenation_Operatorler;

public class C01_Concenation {

    public static void main(String[] args) {

        // sadece aşağıda verilen variable'ları kullanarak istenen değeri yazdıralım

        String s1 = "Java";
        String s2 = "Guzeldir";

        String s3 = "";      // Hiçlik
        String s4 = " ";     // space, boşluk

        int sayi1 = 4;
        int sayi2 = 3;


        System.out.println(s1 + s4 + s2 + sayi1+sayi2); //Java Guzeldir43
        System.out.println(s1 + s4 + s2 + (sayi1+sayi2)); //Java Guzeldir7
        System.out.println(s1 + s4 + s2 + s4 + (sayi1*sayi2)); //Java Guzeldir 12
        System.out.println((sayi1+sayi2) + s1 + s4 + s2 ); //7Java Guzeldir
        System.out.println(s3 + sayi2 + sayi1 + s4 + s1); //34 Java
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2 ); // Java7 Guzeldir43

    }
}

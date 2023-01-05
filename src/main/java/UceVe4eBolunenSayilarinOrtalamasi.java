package Donguler;

import java.util.Scanner;

public class UceVe4eBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Bir Sayı giriniz:");
        sayi=girdi.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if ((i%3 ==0) || (i%4==0)) {
                toplam +=i;
                System.out.println(i);
            }
        }
        System.out.println("Toplam:"+toplam);
    }
}






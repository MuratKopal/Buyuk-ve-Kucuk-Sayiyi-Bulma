package Donguler;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scan.nextInt();
        int min = 999999999, max = -999999999;


        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            int num = scan.nextInt();
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }
        System.out.println("Girilen en büyük sayı : " + max);
        System.out.println("Girilen en küçük sayı : " + min);
    }
}

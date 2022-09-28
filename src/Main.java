import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degikenleri tanimladik.
        String secim;
        double sonuc, a,b;

        Scanner inp=new Scanner(System.in);
        //kullanicidan verileri istedik.
        System.out.println("Carpma: *\nBolme: /\nToplama: +\nCikarma: -");
        System.out.println("Lutfen bir islem seciniz.");
        System.out.print("Seciminiz: ");
        secim=inp.nextLine();

        System.out.print("1.sayiyi giriniz: ");
        a=inp.nextDouble();

        System.out.print("2.sayiyi giriniz: ");
        b=inp.nextDouble();

        switch (secim) {
            case "*":
                sonuc = a * b;
                System.out.println("Islem sonucu: " + sonuc);
            
            case "/":
                sonuc = a / b;
                System.out.println("Islem sonucu: " + sonuc);
            
            case "+":
                sonuc = a + b;
                System.out.println("Islem sonucu: " + sonuc);
            
            case "-":
                sonuc = a - b;
                System.out.println("Islem sonucu: " + sonuc);
            
            default:
                 System.out.println("Hatali giris yaptiniz.");
        }
    }
}

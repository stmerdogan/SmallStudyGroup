package whileloop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("toplama merkezine hosgeldiniz siz 0'a basincaya kadar toplamaya devam edicek");
        int sayi=-1;
        int toplam=0;
        while (sayi!=0){
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayi= scan.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("sayilarin toplami : "+toplam);
    }
}

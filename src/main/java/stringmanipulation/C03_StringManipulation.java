package stringmanipulation;

public class C03_StringManipulation {
    /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.

     */
    public static void main(String[] args) {
        String isim1="Lale";
        String isim2="Merve Can";
        String isim3=" M e r yem ";


        System.out.println("karakterlerin toplami : "+(karakterSayisiAl(isim1)+karakterSayisiAl(isim2)+karakterSayisiAl(isim3)));

        //int c1=isim1.replace(" ", "").length();
        //int c2=isim2.replace(" ", "").length();
        //int c3=isim3.replace(" ", "").length();
        //System.out.println("karakterlerin toplami : "+(c1+c2+c3));


    }

    private static int karakterSayisiAl(String isim1) {
        int c1=isim1.replace(" ", "").length();
    return c1;
    }
}

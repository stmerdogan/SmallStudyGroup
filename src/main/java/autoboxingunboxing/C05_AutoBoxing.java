package autoboxingunboxing;

public class C05_AutoBoxing {
    //tam sayi olan 2 degeri toplayip double deger olarak dondurun


    public static void main(String[] args) {
        int sayi=3;
        int sayi2=7;
        Integer sayi3=sayi+sayi2;//wrapper classinda doubleValue methodu sayesinde double gibi yazdirdik

        System.out.println(sayi3.doubleValue());
    }
}

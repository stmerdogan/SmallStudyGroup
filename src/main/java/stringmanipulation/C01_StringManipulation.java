package stringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        /*
        indexOf() girilen karakterin bastan baslayarak indexini alir ve bize dondurur indexler 0'dan baslar
        lastIndexOf() girilen karakterin sonra baslayarak ilk gordugu karakterin (bastan)indexini verir
        concat() birlestirmeyi saglar ekleme yapar
        charAt() girilen indexteki karakteri bize dondurur
        replace()-replaceAll karakterleri degistirmek icin kullanir biz replaceAllda bir grup datayi degistirebiliriz
        String str="";
        str.replace("a","b");
        str.replaceAll("[a-z]","b");//regex
        subString() ilk girilen indexten ikinci girilen indexe kadar olan degeri bize dondurur ikinci degeri girmez isek sonuna kadar alir
        trim() bastaki ve sondaki bosluklari siler
        split() girilen indexten stringi boler
        equals()-(==) esit mi diye kontrol eder (==)farki ise referans'a bakmaz
        equalsIgnoreCase() buyuk kucuk farketmeksizin esit mi diye kontrol eder
        toUpperCase() tum harfleri buyuk harf yapar
        toLowerCase() tum harfleri kucuk harf yapar
        startsWith() icine girdigimiz degerin stringin basindaki harfin ya da kelimenin dogru olup olmadigini kontrol eder
        endsWith() icine girdigimiz degerin stringin sonundan baslayarak harf ya da kelimenin esit olup olmadigini kontrol eder
        lenght() karakter sayisini bize dondurur
        contains() icerme durumunu kontrol eder
        isBlank() karakter olup olmadigini kontrol eder ve bunun disinda icinde sadece bosluk karakteri varsa yine true doner
        isEmpty() karakter olup olmadigini kontrol eder
        valueOf() stringi int'e donusturur
         */
        //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız.
        String str="Java";
        String str1="java";
        System.out.println(str.equalsIgnoreCase(str1));




    }
}

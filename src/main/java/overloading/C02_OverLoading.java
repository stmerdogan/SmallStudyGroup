package overloading;

public class C02_OverLoading {
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        double arr1[]={1.5,2.5,3.5,4.5};
        toplam(arr1);
        toplam(arr);

    }

    public static void toplam(double[] arr1) {
        double toplam=0;
        for (double a:arr1
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }


    public static void toplam(int[] arr1) {
        int toplam=0;
        for (int a:arr1
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }
}

package overloading;

public class C03_OverLoading {


    C03_OverLoading(){
        System.out.println("1. cons");
    }
    C03_OverLoading(int a){
        System.out.println(a);
    }
    C03_OverLoading(double a){

    }

    public static void main(String[] args) {
        C03_OverLoading obj1=new C03_OverLoading();
        C03_OverLoading obj2=new C03_OverLoading(4);
        C03_OverLoading obj3=new C03_OverLoading(4.5);
    }

}

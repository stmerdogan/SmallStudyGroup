package methodcreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        C04_MethodCreation obj1=new C04_MethodCreation();//referans olarak objeyi kullandim bundan dolayi static olan bir methodun icinde cagirabildim
        obj1.yazdir();
    }

    public void yazdir(){
        System.out.println("bu method static degil");
    }//static olmadigi icin static olan main methodun icinden cagiramadim

}

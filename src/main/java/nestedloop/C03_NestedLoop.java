package nestedloop;

public class C03_NestedLoop {
    public static void main(String[] args) {
        /*
10987654321
1098765432
109876543
10987654
1098765
109876
10987
1098
109
10
 */
        for (int i = 1; i <=5 ; i++) {//satir
            for (int j = 5; j >=i ; j--) {//sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

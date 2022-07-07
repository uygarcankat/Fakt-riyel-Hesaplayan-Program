import java.util.Scanner;


public class Faktoriyel {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int i;
        int x;
        long faktoriyel = 1 ;
        long grup =1;
        long minus = 1;
        double combination;



        System.out.println("Lütfen küme sayısını giriniz");
        int n = input.nextInt();
        final int a = n;




        for (i=n-1; n > 0 && i>0 ; i-=2,n-=2) {

            x= (n*i);
            faktoriyel *= x;

        }

        System.out.println( "faktoriyel:" + faktoriyel);




        System.out.println("Lütfen kaç elemanlı gruplar oluşturmak istediğinizi giriniz ");

        int r = input.nextInt();
        final int c = r;


        for (i=r-1; r > 0 && i>0 ; i-=2,r-=2) {

            x= (r*i);
            grup *= x;


        }
        System.out.println("grup:"+ grup);






         int b= a-c;

         for (i=b-1; b>0 && i>0 ; i-=2,  b=-2) {

            x= (b*i);
            minus *= x;


        }

        System.out.println("fark:"+ minus);

        combination= faktoriyel/(grup*minus);

        System.out.println(combination);



    }

}
package JavaPrograms;

/**
 * Created by Sharon on 10/19/17.
 */
public class FibonacciSeries {

    public void printFiboancci(){
        int n = 10;
        int a=0, b=1, i=1, c=0;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        while (i<=n){
            c =a + b;
            System.out.print(" ");
            System.out.print(c);
            a = b;
            b = c;
            i ++;

        }

    }
}

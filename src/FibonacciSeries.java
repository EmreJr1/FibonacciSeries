import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz :");
        int n=input.nextInt();
        int fib1=0;
        int fib2=1;

        if (n>=1){
            System.out.print(fib1 + " ");
        }

        if (n>=2) {
            System.out.print(fib2 + " ");
        }


        for (int i=3 ; i<=n ; i++){
            int fib3=fib1+fib2;

            System.out.print(fib3+" ");
            fib1=fib2;
            fib2=fib3;

        }

    }
}

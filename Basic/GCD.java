package Basic;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n1,n2;
        int gcd=0;

        System.out.println("enter the value of the n1 && n2");

        n1=sc.nextInt();
        n2=sc.nextInt();

        for(int i=1; i<=n1 && i<=n2;i++)
        {
            if(n1 %i==0 && n2%i==0)
            gcd=i;
        }
        int lcm=(n1*n2)/gcd;
       System.out.println("lcm of the two numbers is the "+lcm);
    }
}

import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1=n;
        String str=String.valueOf(n);
        int len=str.length();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=(int)Math.pow(rem, len);
            n=n/10;
        }
        System.out.println(sum);
        if(sum==n1)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
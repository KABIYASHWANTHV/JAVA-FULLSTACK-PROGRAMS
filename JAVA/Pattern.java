import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            System.out.println("  "+ i+"     "+i);
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
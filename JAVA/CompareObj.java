import java.util.Scanner;
public class CompareObj 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first object's name");
        String name1 = sc.nextLine();
        System.out.println("Enter the second object's name");
        String name2 = sc.nextLine();
        if(name1.equals(name2))
        {
            System.out.println("Two objects are equal");
        }
        else
        {
            System.out.println("Two objects are not equal");
        }
    }
}

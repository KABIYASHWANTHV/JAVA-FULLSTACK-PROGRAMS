import java.util.Scanner;
public class ArrayConcept
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum of array elements : "+sum);
    }
}
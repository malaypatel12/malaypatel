import java.util.Scanner;                       //jai kalbhairav//
public class pra3{
public class pra2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int len=0;
        System.out.print("Enter length of array: ");
        len= inp.nextInt();
        int arr[] = new int[len];
        System.out.print("Enter elements of the array: ");

        for(int i=0;i<len;i++)
        {
        	a1[i] = inp.nextInt();
        }
 
        int firstRepeatElement = FindFirstRepeatElement(arr);
        
        if (firstRepeatElement != 0) 
        {
            System.out.println("First repeating element: " + firstRepeatElement);
        } 
        else 
        {
            System.out.println("No repeat element in the array.");
        }
    }
    
    public static int FindFirstRepeatElement(int[] arr) 
    {    
        for (int i = 0; i < a1.length - 1; i++) 
        {
            for (int j = i + 1; j < a1.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}

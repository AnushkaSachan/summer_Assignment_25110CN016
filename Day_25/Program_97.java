import java.util.*;
class Program_97    // Program to merge sorted array.
{
    public static void main ( String args [] )
    {
        int i , j , k , n1 , n2 ; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first sorted array : ");
        n1 = sc.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter elements of first sorted array : ");
        for ( i = 0 ; i < n1 ; i++ ) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second sorted array : ");
        n2 = sc.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter elements of second sorted array : ");
        for ( i = 0 ; i < n2 ; i++ ) 
        {
            b[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];
        i = 0 ; j = 0 ;

        for ( k = 0 ; k < n1 + n2 ; k++ )
        {
            if (i < n1 && (j >= n2 || a[i] <= b[j])) 
            {
                merged[k] = a[i];
                i++;
            } 
            else 
            {
                merged[k] = b[j];
                j++;
            }
        }

        System.out.println("Merged sorted array:");
        for ( i =  0 ; i < n1+n2 ; i ++ ) 
        {
            System.out.print(merged[i] + " ");
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class Largest_among_n_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.printf("The largest element is %d",max);
    }
}

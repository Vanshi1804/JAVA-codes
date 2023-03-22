import java.util.Scanner;

public class Swap_number {
    public static void main(String[] args) {

        int n;
        int m;
        int temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        n = sc.nextInt();

        System.out.println("Enter the second number : ");
        m= sc.nextInt();

        System.out.printf("Number before swapping (%d,%d)",n,m);

        temp = n;
        n = m ;
        m = temp ;

        System.out.printf("\nNumber after swapping (%d,%d)",n,m);
    }
}

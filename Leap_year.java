import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int n = sc.nextInt();

        if(n%4==0)
        {
            System.out.printf("%d is a leap year",n);
        }
        else if(n % 400 ==0)
        {
            System.out.printf("%d is a leap year",n);
        }
        else if(n%100 == 0)
        {
            System.out.printf("%d is not a leap year",n);
        }
        else {
            System.out.printf("%d is not a leap year",n);
        }



    }
}

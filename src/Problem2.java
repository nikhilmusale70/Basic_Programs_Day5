import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a year to check if number is leap year or not :- ");
        int year = sc.nextInt();
        if(year<=9999 && year>999){
            if (year%400 == 0)
                System.out.println(year + " is a leap year");
            else if (year%100 == 0)
                System.out.println(year + " is not a leap year");
            else if (year%4 == 0)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " it is not a leap year");
        }
        else
            System.out.println("You entered invalid year");
    }
}

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to ind its prime factorisation :- ");
        int number = sc.nextInt();
        System.out.print("Prime factors of number "+number+ " are \n ");
        for (int i = 2 ; i <= number/2 ; i++){
            while(number%i==0){
                System.out.print(i+ " ");
                number=number/i;
            }
        }
        if (number>2)
            System.out.println(number);
    }
}

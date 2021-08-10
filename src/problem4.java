import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.print("Enter n :- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum =0.0;

        for (int i=1; i<=n; i++){
            sum = sum + (1.0/i);
        }

        System.out.println("N'th harmonic value is :- " + sum);
    }
}

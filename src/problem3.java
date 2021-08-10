import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        if (n<31 && n>=0)
            for(int i=0;i<n;i++){
                System.out.println("2^"+i+" = "+ (int) Math.pow(2,i));
            }

    }
}

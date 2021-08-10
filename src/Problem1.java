import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int heads=0;
        int tails=0;
        System.out.print("Enter no. of flips you want :- ");
        int no_of_flips = sc.nextInt();

        for (int i=0;i<no_of_flips;i++) {
            double random = Math.random();
            if (random < 0.5)
                tails++;
            else
                heads++;
        }
        double head_percentage = (heads*100.0)/no_of_flips;
        double tails_percentage = (tails*100.0)/no_of_flips;

        System.out.println("heads Perentage :- "+ head_percentage + "% \nTails percentage :- "+ tails_percentage+ "%");

    }

}
import java.util.Random;

public class Problem8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        if (number%2==0)
            System.out.println(number+" is even");
        else
            System.out.println(number+ " is odd");
    }
}

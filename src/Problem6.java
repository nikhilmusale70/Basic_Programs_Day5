import java.util.Random;

public class Problem6 {
    public static void main(String[] args) {
        Random ran = new Random();
        int divisor = ran.nextInt(10)+1;
        int dividend = ran.nextInt(10)+1;

        double quotient = (dividend*1.0) / divisor;
        int remender = dividend % divisor;

        System.out.println("quotient :- " + quotient + " /remender :- " + remender);
    }
}

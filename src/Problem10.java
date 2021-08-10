import java.util.Random;

public class Problem10 {
    public static void main(String[] args) {
        Random ran = new Random();

        int a = ran.nextInt(100);
        int b = ran.nextInt(100);
        int c = ran.nextInt(100);
        System.out.println("3 Numbers are "+ a +" "+b+ " "+c);
        if (a>b&&a>c)
            System.out.println(a+ " is greatest");
        else if (b>a && b>c)
            System.out.println(b+ " is greatest");
        else
            System.out.println(c+ " is greatest");
    }
}

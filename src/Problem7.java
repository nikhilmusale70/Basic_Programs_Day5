public class Problem7 {
    public static void main(String[] args) {
        int a =1;
        int b =4;
        int temp;

        System.out.println("Before swap \nfirst_number is "+a+" and second_number is "+b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap \nfirst_number is "+a+" and second_number is "+b);
    }
}

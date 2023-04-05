
public class Main {
    public static void main(String[] args) {
        int a = 85;
        int b = 14;
        int c = 45;
        int d = 6;
        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println(sum1>sum2);
        ++sum1;
        sum2 -= 2;
        System.out.println(sum1>sum2);

        System.out.println(((sum1 % 2) == 0) || ((sum2 % 2) == 0));

    }
}
